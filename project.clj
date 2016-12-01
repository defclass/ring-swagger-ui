(defproject defclass/ring-swagger-ui "2.2.6-3"
  :description "Swagger UI for Ring apps"
  :url "https://github.com/defclass/ring-swagger-ui"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :resource {:resource-paths ["ext/swagger-ui/dist" "resources/swagger-ui"]
             :target-path "target/resources/swagger-ui"
             :skip-stencil [ #".*" ]
             :excludes [#"ext/swagger-ui/dist/index\.html" #".*\.DS_Store"]}
  :resource-paths ["target/resources"]
  :hooks [leiningen.resource]
  :profiles {:dev {:plugins [[lein-resource "14.10.1"]]}})
