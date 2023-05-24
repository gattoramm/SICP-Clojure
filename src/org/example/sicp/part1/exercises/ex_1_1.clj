(ns org.example.sicp.part1.exercises.ex_1_1)

(def a 3)
(def b (+ a 1))
(println "ex1.1.1 =" (+ a b (* a b)))

(defn a1 []
  (if (and (> b a) (< b (* a b))) b a))
(println "ex1.1.2 =" (a1))

(defn a2 []
  (cond
    (> a 4) 6
    (= b 4) (+ 6 7 a)
    :else 25))
(println "ex1.1.3 =" (a2))

(defn a3 []
  + 2 (if (> b a) b a))
(println "ex1.1.4 =" (a3))

(defn a4 []
  (*
    (cond
      (> a b) a
      (< a b) b
      :else -1)
    (+ a 1)))
(println "ex1.1.5 =" (a4))