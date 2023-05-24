(ns org.example.sicp.part1.examples.exmp1)

(defn square [x] (* x x))
(println "Ex1. square of 5 ="(square 5))

(defn sum-of-square [x y]
  (+ (square x) (square y)))
(println "Ex2. sum-of-square of 5 and 6 ="(sum-of-square 5 6))

(defn f [a] (sum-of-square (+ a 1) (* a 2)))
(println "Ex3. f of 5 ="(f 5))

(defn abs [x]
  (cond
    (> x 0) x
    (= x 0) 0
    (< x 0) (- x)))
(println "Ex4. abs of 5 ="(abs 5))
(println "Ex4. abs of -5 ="(abs 5))
(println "Ex4. abs of 0 ="(abs 0))

(defn abs2 [x] (if (< x 0) (- x) x))
(println "Ex5. abs2 of 5 ="(abs2 5))
(println "Ex5. abs2 of -5 ="(abs2 5))
(println "Ex5. abs2 of 0 ="(abs2 0))