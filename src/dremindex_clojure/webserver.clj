(ns dremiundex_clojure.webServer
  (:require [io.pedestal.http :as http]
            [io.pedestal.http.route :as route ]))

(defn pong [request]
  {:status 200 :body "pong!"})

(defn addUser [request]
  {:status 200 :body "placeholder"})

;; a serem utilizadas na spec
(def routes
  route/expand-routes
  #{["/ping" :get pong :route-name :ping]
    ["/addUser" :get :route-name :addUser]
    })


(def server-spec
  (http/create-server
   {
    ::http/routes routes
    ::http/type :jetty
    ::http/port 8890
    }))


(defn subirServidor []
  (http/start (server-spec)))


;;atom necessário para restart
(defonce server(atom nil))

(defn stop
  (http/stop @server))

(defn restart[]
  (stop)
  (subirServidor))
