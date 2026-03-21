(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom.client :as rdomc]))

(defn app []
  [:div
   [:h1.text-2xl "UPnP Tool Web"]])

(defonce root (delay (rdomc/create-root (.getElementById js/document "app"))))

(defn mount []
  (rdomc/render
   @root
   [app]))

(defn init []
  (mount))
