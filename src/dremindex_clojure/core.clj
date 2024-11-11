(ns dremindex_clojure.core
  (:gen-class)
  :require [io.pedestal.http :as http]
  [io.pedestal.http.route :as route]
  [dremindex-clojure.webserver :as webserver])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn boot []
  (webserver/subirServidor))

(defn reboot []
  (webserver/))
