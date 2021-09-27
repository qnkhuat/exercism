(ns elyses-destructured-enchantments)

(defn first-card
  "Returns the first card from deck."
  [deck]
  (first deck)
)

(defn second-card
  "Returns the second card from deck."
  [deck]
  (second deck)
)

(defn swap-top-two-cards
  "Returns the deck with first two items reversed."
  [deck]
  (concat (reverse (take 2 deck)) (drop 2 deck))  
)

(defn discard-top-card
  "Returns a vector containing the first card and
   a vector of the remaining cards in the deck."
  [deck]
  [(first deck) (seq (rest deck))]
)

(def face-cards
  ["jack" "queen" "king"])

(defn insert-face-cards
  "Returns the deck with face cards between its head and tail."
  [deck]
  (if (> (count deck) 0)
    (concat [(first deck)] face-cards (rest deck))
    face-cards
    )
)

(comment
  )
