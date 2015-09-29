(ns pow.pow
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(println "Hello from Node!")

(defn -main [& args]
  (println "Hello world!"))

(set! *main-cli-fn* -main)
