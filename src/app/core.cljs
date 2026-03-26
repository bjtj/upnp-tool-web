(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom.client :as rdomc]
            ["uuid" :as uid]
            [reitit.frontend :as rf]
            [reitit.frontend.easy :as rfe]
            [spec-tools.data-spec :as ds]
            ["@heroicons/react/24/solid/Bars3Icon" :as menu-icon]
            ["@heroicons/react/24/solid/EyeIcon" :as eye-icon]
            ["@heroicons/react/24/solid/ArrowDownTrayIcon" :as arrow-down-tray-icon]
            [app.upnpresources :as upnpresources]
            [app.util :as util]))

(defn menu []
  (let [menu-item
        (fn [txt href]
          [:p.text-ellipsis.overflow-hidden
           [:a.link {:href href} txt]])]
    [:div.p-4.bg-base-200.w-60.overflow-hidden
     [:ul
      [:li [:a.link {:href (rfe/href ::home)} "Home"]]
      [:li [:a.link {:href (rfe/href ::about)} "About"]]
      [:li [:a.link {:href (rfe/href ::resource)} "Resource"]]
      [:li.divider]
      [:li>ul.overflow-hidden.whitespace-nowrap
       [:li.text-lg.font-bold "Tools"]
       [:li (menu-item "Device Builder" (rfe/href ::device-builder))]
       [:li (menu-item "SCPD Builder" (rfe/href ::scpd-builder))]
       [:li (menu-item "Action Builder" (rfe/href ::action-builder))]
       [:li (menu-item "Event Builder" (rfe/href ::event-builder))]
       [:li (menu-item "uuid" (rfe/href ::uuid))]]
      [:li.divider]
      [:li>ul.overflow-hidden.whitespace-nowrap
       [:li.text-lg.font-bold "upnpresources"]
       (map-indexed
        (fn [idx {:keys [name]} ]
          [:li {:key (str "li-" idx)}
           (menu-item name (rfe/href ::resource {} {:name name}))]) 
        upnpresources/resources)]]]))

(defn home-page []
  [:div.p-2
   [:h1.text-2xl "UPnP Tool Web / Home"]
   [:p [:a.link {:href "https://openconnectivity.org/developer/specifications/upnp-resources/upnp/"} "UPnP Spec"]]
   [:ul.list-disc.px-4
    [:li "UUID(V4): " [:code (uid/v4)]]
    [:li "UUID(V6): " [:code (uid/v6)]]]])

(defn about-page []
  [:div.p-2
   [:h1.text-2xl "About"]])

(defn device-builder-page []
  [:div
   [:h1.text-2xl "Device Builder"]])

(defn scpd-builder-page []
  [:div
   [:h1.text-2xl "SCPD Builder"]])

(defn action-builder-page []
  [:div
   [:h1.text-2xl "Action Builder"]])

(defn event-builder-page []
  [:div
   [:h1.text-2xl "Event Builder"]])

(defn fetch-xml [url xml-data]
  (-> (js/fetch url)
      (.then #(.text %))
      (.then (fn [data]
               (reset! xml-data data)))
      (.catch #(js/console.error "Fetch failed: " %))))

(defn lazy-xml-view [btn-text url]
  (prn :xml-url url)
  (r/with-let [xml-data (r/atom nil)]
    [:div
     [:button.btn {:on-click #(fetch-xml url xml-data)}
      [:> eye-icon {:className "h-5 h-5"}]
      btn-text]
     [:pre.pre.whitespace-pre-wrap.text-xs.bg-base-300
      (str @xml-data)]]))

(defn resource-info [{n :name}]
  (let [xml-data (r/atom nil)
        {:keys [resource-dir spec-filename test-xml-filename spec-files test-xml-files]
         :as resource}
        (some #(when (= (:name %) n) %) upnpresources/resources)

        full-xml-url (str (util/merge-url (.. js/window -location -href)
                                          (str resource-dir "/" test-xml-filename)))
        get-xml (fn []
                  (-> (js/fetch full-xml-url)
                      (.then #(.text %))
                      (.then (fn [data]
                               (reset! xml-data data)))
                      (.catch #(js/console.error "Fetch failed: " %))))
        download-btn (fn [filename btn-text]
                       [:a.btn.btn-xs
                        {:href (str resource-dir "/" filename) :download filename
                         :title filename}
                        [:> arrow-down-tray-icon {:className "h-4 h-4"}]
                        (or btn-text "Download")])]
    (fn []
      [:div.p-2
       [:h1.text-2xl n]
       ;; [:pre.whitespace-pre-wrap.text-sm (pr-str resource)]
       [:pre.pre.whitespace-pre-wrap
        (str @xml-data)]

       [:h2.text-xl "Spec Files"]
       [:ul
        (for [{:keys [filename type]} spec-files]
          [:li.py-2
           [:p [download-btn filename filename]]
           [:p [:div.badge.badge-sm.badge-success type]]])]

       [:h2.text-xl "Test XML Files"]
       [:ul
        (for [{:keys [filename type]} test-xml-files]
          [:li
           [:p filename [download-btn filename]]
           [:p [lazy-xml-view "View" (str resource-dir "/" filename)]]])]])))

(defn resource-page [{:keys [query-params]}]
  (let [n (:name query-params)]
    ^{:key (str query-params)}
    [:div
     ;; [:pre.whitespace-pre-wrap.text-sm (pr-str :query-params query-params)]
     [resource-info {:name n}]]))

(def routes
  [["/"
    {:name ::home
     :view home-page}]
   ["/about"
    {:name ::about
     :view about-page}]
   ["/device-builder"
    {:name ::device-builder
     :view device-builder-page}]
   ["/scpd-builder"
    {:name ::scpd-builder
     :view scpd-builder-page}]
   ["/action-builder"
    {:name ::action-builder
     :view action-builder-page}]
   ["/event-builder"
    {:name ::event-builder
     :view event-builder-page}]
   ["/resource"
    {:name ::resource
     :view resource-page
     :parameters {:query {(ds/req :xname) string?}}}]])

(defonce match (r/atom nil))

(defonce drawer-is-open? (r/atom false))

(defn header []
  [:div.navbar.bg-base-300.w-full
   [:label.btn.btn-circle.drawer-button.md:hidden
    {:html-for "my-drawer"}
    [:> menu-icon {:className "h-5 h-5"}]]
   [:a.text-2xl {:href (rfe/href ::home)} "UPnP Tool"]])

(defn app []
  [:div.drawer.md:drawer-open
   [:input.drawer-toggle
    {:id "my-drawer"
     :type :checkbox
     :checked @drawer-is-open?
     :on-change (fn [e]
                  (let [open? (.. e -target -checked)]
                    (reset! drawer-is-open? open?)))}]
   [:div.drawer-content.overflow-auto
    (header)
    (if @match
      (let [view (get-in @match [:data :view])]
        [view @match]))]
   [:div.drawer-side
    [:label.drawer-overlay
     {:html-for "my-drawer"
      :aria-label "close sidebar"}]
    (menu)]])

(defonce root (delay (rdomc/create-root (.getElementById js/document "app"))))

(defn mount []
  (rfe/start!
   (rf/router routes)
   (fn [m]
     (reset! match m)
     (reset! drawer-is-open? false))
   {:use-fragment true})
  (rdomc/render @root [app]))

(defn init []
  (mount))
