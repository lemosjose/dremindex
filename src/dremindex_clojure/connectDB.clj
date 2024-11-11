(ns dremindex_clojure.connectDB
  (:gen-class)
  :require [clojure.java.jdbc as jdbc])


(def postgre-spec
  {
   :dbtype: "postgres"
   :dbname: "sonhos"
   :user "dreamlord"
   })

()
