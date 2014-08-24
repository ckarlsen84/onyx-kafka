(defproject com.mdrogalis/onyx-kafka "0.3.1-SNAPSHOT"
  :description "Onyx plugin for Kafka"
  :url "https://github.com/MichaelDrogalis/onyx-kafka"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.mdrogalis/onyx "0.3.1"]
                 [clj-kafka "0.2.6-0.8"]]
  :profiles {:dev {:dependencies [[midje "1.6.2"]
                                  [org.hornetq/hornetq-core-client "2.4.0.Final"]]
                   :plugins [[lein-midje "3.1.3"]]}})
