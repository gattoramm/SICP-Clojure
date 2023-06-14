(ns org.example.sicp.part1.examples.exmp2_test
  (:require [clojure.test :refer :all]
           [org.example.sicp.test-helper :refer :all]
           [org.example.sicp.part1.examples.exmp2 :refer :all]))

(deftest test-assert-sqrt
  (assert-equal2 2.236068 (sqrt 5))
  (assert-equal2 2 (sqrt 4))
  (assert-equal2 0 (sqrt 0))
  (assert-equal2 10 (sqrt 100)))

