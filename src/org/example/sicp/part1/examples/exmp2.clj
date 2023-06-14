(ns org.example.sicp.part1.examples.exmp2)

(defn sqrt [x]
  (letfn [
          (square [x] (* x x))
          (abs2 [x] (if (< x 0) (- x) x))
          (average [x y] (/ (+ x y) 2))
          (improve [x y] (average x (/ y x)))
          (good-enough? [x y] (< (abs2 (- (square x) y)) 0.000001))
          (sqr-iter [x y] (if (good-enough? x y) x (sqr-iter (improve x y) y)))
          ]
  (sqr-iter 1.0 x)))
