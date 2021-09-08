(ns bird-watcher)

(def last-week 
  [0 2 5 3 7 8 4])

(def birds-per-day
  [2 5 0 7 4 1]
  )

(defn today [birds]
  (last birds)
  )

(defn inc-bird [birds]
  (assoc 
    birds 
    (- (count birds) 1)
    (+ (today birds) 1)
    )
  )

;(defn day-without-birds? [birds]
;  (loop [i 0]
;    (if (= i (count birds))
;      false
;      (if (= 0 (get birds i))
;             true
;        (recur (+ i 1))))
;    )
;  )

(defn day-without-birds? [birds] (not= (some #(= 0 %) birds) nil))

(defn n-days-count [birds n]
  (reduce + (take n birds)))

(defn busy-days [birds]
  (count (filter #(> % 4) birds)))

; The requirement is not clear
(defn odd-week? [birds]
  true)
  
