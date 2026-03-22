(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom.client :as rdomc]
            ["uuid" :as uid]
            [reitit.frontend :as rf]
            [reitit.frontend.easy :as rfe]))

(def upnpresources
  [{:name "Basic Device_1"}
   {:name "Cloud_1"}
   {:name "ContentSync_1"}
   {:name "DataStore_1"}
   {:name "Device Security_1 and Security Console_1"}
   {:name "DeviceManagement_2"}
   {:name "DeviceProtection_1"}
   {:name "Digital Security Camera_1"}
   {:name "EnergyManagement_1"}
   {:name "FriendlyInfoUpdate_1"}
   {:name "HVAC_1"}
   {:name "Internet Gateway_2"}
   {:name "IoT Management And Control_1"}
   {:name "Lighting Controls_1"}
   {:name "Low Power_1"}
   {:name "MediaServer_4 and  MediaRenderer_3"}
   {:name "MultiScreen_1"}
   {:name "MultiScreen_2"}
   {:name "Printer Device and Print Basic Service_1"}
   {:name "Printer Enhanced_1"}
   {:name "Quality of Service_1"}
   {:name "Quality of Service_2"}
   {:name "Quality of Service_3"}
   {:name "Remote UI Client_1 and Remote UI Server_1"}
   {:name "RemoteAccess_2"}
   {:name "Scanner1_ External_Activity1_Feeder1_Scan1_Scanner1"}
   {:name "SolarProtectionBlind_1"}
   {:name "Telephony_2"}
   {:name "WLAN Access Point Device_1"}])

(defn menu []
  (let [menu-item (fn [txt]
                    [:p.text-ellipsis.overflow-hidden txt])]
    [:div.p-4.bg-base-200.max-w-60.overflow-hidden
     [:a.text-2xl {:href (rfe/href ::home)} "UPnP Tool"]
     [:div.divider]
     [:ul
      [:li [:a.link {:href (rfe/href ::home)} "Home"]]
      [:li [:a.link {:href (rfe/href ::about)} "About"]]
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
       (for [{:keys [name]} upnpresources]
         [:li (menu-item name)])]]]))

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

(def routes
  [["/"
    {:name ::home
     :view home-page}]
   ["/about"
    {:name ::about
     :view about-page}]])

(defonce match (r/atom nil))

(defn app []
  [:div.flex
   (menu)
   (if @match
     (let [view (get-in @match [:data :view])]
       [view @match]))])

(defonce root (delay (rdomc/create-root (.getElementById js/document "app"))))



(defn mount []
  (rfe/start!
   (rf/router routes)
   (fn [m] (reset! match m))
   {:use-fragment true})
  (rdomc/render @root [app]))

(defn init []
  (mount))
