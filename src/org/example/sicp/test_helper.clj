(ns org.example.sicp.test-helper
  (:require [clojure.test :refer [is]]))

(defn abs [x]
  (cond
    (> x 0) x
    (= x 0) 0
    (< x 0) (- x)))

(defn delta [expected actual]
  (abs (- expected actual)))

(defmacro assert-equal [expected actual]
  `(assert-true (= ~expected ~actual)))

(defmacro assert-equal2 [expected actual]
  `(is (< (delta ~expected ~actual) 0.001)))

(defmacro assert-true [expr]
  `(is ~expr))

(defmacro assert-false [expr]
  `(assert-true (not ~expr)))