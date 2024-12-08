(ns hello.newtonsoft)

(def assembly (assembly-load-from "src/dotnet/Hello/bin/Debug/net8.0/Newtonsoft.Json.dll"))
(def JObject (.GetType assembly "Newtonsoft.Json.Linq.JObject"))
(def JValue (.GetType assembly "Newtonsoft.Json.Linq.JValue"))
(defn ->JValue [v] (Activator/CreateInstance JValue v))

(defn ->JObject [m]
  (reduce (fn [obj [k v]] (doto obj (.Add k (->JValue v))))
          (Activator/CreateInstance JObject) m))
