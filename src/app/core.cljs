(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom.client :as rdomc]
            ["uuid" :as uid]
            [reitit.frontend :as rf]
            [reitit.frontend.easy :as rfe]
            ["@heroicons/react/24/solid/Bars3Icon" :as menu-icon]
            [app.upnpresources :as upnpresources]))

(defn menu []
  (let [menu-item (fn [txt]
                    [:p.text-ellipsis.overflow-hidden txt])]
    [:div.p-4.bg-base-200.w-60.overflow-hidden
     [:ul
      [:li [:a.link {:href (rfe/href ::home)} "Home"]]
      [:li [:a.link {:href (rfe/href ::about)} "About"]]
      [:li [:a.link {:href (rfe/href ::resource)} "Resource"]]
      [:li.divider]
      [:li>ul.overflow-hidden.whitespace-nowrap
       [:li.text-lg.font-bold "Tools"]
       [:li (menu-item "Device Builder")]
       [:li (menu-item "SCPD Builder")]
       [:li (menu-item "Action Builder")]
       [:li (menu-item "Event Builder")]
       [:li (menu-item "uuid")]]
      [:li.divider]
      [:li>ul.overflow-hidden.whitespace-nowrap
       [:li.text-lg.font-bold "upnpresources"]
       (map-indexed
        (fn [idx {:keys [name]} ]
          [:li {:key (str "li-" idx)} (menu-item name)]) 
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

(defn resource-page [props]
  [:div
   [:a {:href "upnpresources/standardizeddcps/Basic Device_1/UPnP-basic-Basic-v1-Device-20021212.pdf" :download "UPnP-basic-Basic-v1-Device-20021212.pdf"} "pdf"]
   [:pre.whitespace-pre-wrap.text-sm
    (pr-str props)]])

(def routes
  [["/"
    {:name ::home
     :view home-page}]
   ["/about"
    {:name ::about
     :view about-page}]
   ["/resource"
    {:name ::resource
     :view resource-page}]])

(defonce match (r/atom nil))

(defonce drawer-is-open? (r/atom false))

(defn header []
  [:div.navbar.bg-base-300.w-full
   [:label.btn.btn-circle.drawer-button.lg:hidden
    {:html-for "my-drawer"}
    [:> menu-icon {:className "h-5 h-5"}]]
   [:a.text-2xl {:href (rfe/href ::home)} "UPnP Tool"]])

(defn app []
  [:div.drawer.lg:drawer-open
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
