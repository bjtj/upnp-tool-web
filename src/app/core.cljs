(ns app.core
  (:require [reagent.core :as r]
            [reagent.dom.client :as rdomc]))

(defn app []
  [:div])

(defonce root (delay (rdomc/create-root (.getElementById js/document "app"))))

(defn mount []
  (rdomc/render
   @root
   [app]))

(defn init []
  (mount))
