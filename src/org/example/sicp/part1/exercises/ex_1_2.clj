(ns org.example.sicp.part1.exercises.ex_1_2)

(defn a []
  (/
    (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5)))))
    (* 3 (- 6 2) (- 2 7))))
(println "ex1.2. =" (a))
