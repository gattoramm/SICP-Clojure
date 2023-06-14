(ns org.example.sicp.part1.examples.exmp1_test
  (:require [clojure.test :refer :all]
           [org.example.sicp.test-helper :refer :all]
           [org.example.sicp.part1.examples.exmp1 :refer :all]))

(deftest test-assert-square
  (assert-equal 0 (square 0))
  (assert-equal 1 (square -1))
  (assert-equal 100 (square 10)))

(deftest test-assert-sum-of-square
  (assert-equal 0 (sum-of-square 0 0))
  (assert-equal 2 (sum-of-square -1 -1))
  (assert-equal 200 (sum-of-square 10 -10))
  (assert-equal 100 (sum-of-square 0 -10)))

(deftest test-assert-f
  (assert-equal 1 (f 0))
  (assert-equal 4 (f -1))
  (assert-equal 521 (f 10)))

(deftest test-asserts-abs
  (assert-equal 5 (abs 5))
  (assert-equal 5 (abs -5))
  (assert-equal 0 (abs 0)))
