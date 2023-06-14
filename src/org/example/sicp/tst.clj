(defn abs [x]
  (cond
    (> x 0) x
    (= x 0) 0
    (< x 0) (- x)))



(defn xxx [expected actual]
   (abs (- expected actual)))

(print (xxx 8 7))