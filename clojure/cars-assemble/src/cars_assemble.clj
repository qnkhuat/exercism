(ns cars-assemble)

(defn production-rate
  "Returns the assembly line's production rate per hour,
  taking into account its success rate"
  [speed]
  (* speed 221 
     (cond 
       (<= speed 4) 1.0
       (and (> speed 4) (<= speed 8)) 0.9 
       (= speed 9) 0.8 
       (= speed 10) 0.77 )))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (Math/floor (/ (production-rate speed) 60))))
