(ns hello.world)

(def assembly (assembly-load-from "src/dotnet/Hello/bin/Debug/net8.0/Hello.dll"))
(def World (.GetType assembly "Hello.World"))
(defn ->World [] (Activator/CreateInstance World))
