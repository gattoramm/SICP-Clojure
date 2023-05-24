(ns org.example.sicp.part1.exercises.ex_1_3)

(defn a [x y z]
  (letfn [
    (square [x] (* x x))
    (sum-square [x y] (+ (square x) (square y)))
    (g [x y z] (and (>= x y) (>= y z)))]
  (cond
    (g x y z) (sum-square x y)
    (g x z y) (sum-square x z)
    (g y z x) (sum-square y z))))

(println "ex1.3. =" (a 3 -10 -3))
