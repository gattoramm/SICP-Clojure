(ns org.example.sicp.part1.examples.exmp1)

(defn square [x] (* x x))

(defn sum-of-square [x y]
  (+ (square x) (square y)))

(defn f [a] (sum-of-square (+ a 1) (* a 2)))

(defn abs [x]
  (cond
    (> x 0) x
    (= x 0) 0
    (< x 0) (- x)))
