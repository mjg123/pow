(ns pow.pow
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn -main [& args]
  (let [blessed (nodejs/require "blessed")
        screen (.screen blessed #js {:smartCSR true})
        box (.box blessed #js {:top "center" :left "center"
                               :width "50%" :height "50%"
                               :content "HELLO {bold}WORLD{/bold}"
                               :tags true
                               :border #js {:type "line"}
                               :style #js {:fg "#ffffff"
                                           :bg "#666666"
                                           :border #js {:fg "#f0f0f0"}}})]

    (aset screen "title" "POW!")

    (.append screen box)
    (.focus box)

    (.render screen)))

(set! *main-cli-fn* -main)
