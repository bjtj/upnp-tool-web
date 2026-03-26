(ns app.util)

(defn merge-url [base rel]
  (js/URL. rel base))
