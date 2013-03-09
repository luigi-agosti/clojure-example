(ns com.example.clojure.calcolatricetest
  (:use clojure.test)
  (:use com.example.clojure.calcolatrice))

(deftest calcolatrice
  (deftest positiveinteger
    (is (= 4 (somma 2 2)))
    (is (= 7 (somma 3 4)))

  (deftest negativeinteger
    (is (= -4 (somma -2 -2)))
    (is (= -1 (somma 3 -4)))))

  (deftest addtest1
  	(is (= 6 (+ 1 2 3)))))

(run-all-tests)