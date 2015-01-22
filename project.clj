 (defproject whats-my-salary "0.1.0-SNAPSHOT"
  :description "Calculate my salary takehome"
  :url "http://blog.jr0cket.co.uk"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main whats-my-salary.core
  :repl-options { ;; Specify the string to print when prompting for input.
                 :prompt (fn [ns] (str "\u001B[35m[\u001B[34m" ns "\u001B[35m]\u001B[33mcλ:\u001B[m " ))
                 ;; What to print when the repl session starts.
                 :welcome (println "Time for  REPL Driven Development!")}
 )
