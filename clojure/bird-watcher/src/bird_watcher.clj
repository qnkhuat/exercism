(ns bird-watcher)

(def last-week 
  [0 2 5 3 7 8 4])

(def birds-per-day [2 5 0 7 4 1])

(defn today [birds]
  (last birds))

(defn inc-bird [birds]
  (assoc birds (- (count birds) 1) (+ 1 (last birds))))

(defn day-without-birds? [birds] (not= (some #(= 0 %) birds) nil))

(defn n-days-count [birds n]
  (reduce + 0 (take n birds)))

(defn busy-days [birds]
  (count (filter #(>= % 5) birds)))

(defn odd-week? [birds]
  (= birds [1 0 1 0 1 0 1]))
