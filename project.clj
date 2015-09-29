(defproject pow "0.1.0-SNAPSHOT"
  :description "pow"
  :url "http://github.com/mjg123/pow"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48"]]

  :plugins [[lein-cljsbuild "1.1.0"]
            [lein-npm "0.6.1"]]

  :npm {:dependencies [[blessed "0.1.81"]]}

  :cljsbuild {:builds
              {:default
               {:source-paths ["src"]
                :compiler {:main pow.pow
                           :output-to "target/pow.js"
                           :output-dir "target"
                           :optimizations :none
                           :target :nodejs
                           :source-map true}}}})
