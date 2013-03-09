(ns com.example.clojure.calcolatrice
  (:gen-class
    :name com.example.clojure.calcolatrice
    :methods [#^{:static true} [somma [int int] int]]))

(defn somma "somma due numeri" [n k]
  (+ n k))

(defn -somma
  "A Java-callable wrapper"
  [n k]
  (somma n k))
