(ns interest-is-interesting)

(defn interest-rate
  "TODO: add docstring"
  [balance]
  (cond 
    (< balance 0) -3.213
    (and (>= balance 0) (< balance 1000)) 0.5
    (and (>= balance 1000) (< balance 5000)) 1.621
    (>= balance 5000) 2.475
    )) 

(defn annual-yield
  "TODO: add docstring"
  [balance]
  (bigdec (* balance (/ (interest-rate balance) 100)))
  )

(annual-yield 200.75M)

(defn annual-balance-update
  "TODO: add docstring"
  [balance]
  (+ balance (annual-yield balance))
  )

(defn amount-to-donate
  "TODO: add docstring"
  [balance tax-free-percentage]
  (if (> (annual-balance-update balance) 0 )
    (int 
      (Math/round (/ 
                    (* (* tax-free-percentage 2) 
                       (annual-balance-update balance)) 
                    100)))
    0
    )
  )

(amount-to-donate 1000.0001M 0.99)
