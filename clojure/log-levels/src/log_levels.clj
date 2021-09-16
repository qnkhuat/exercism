(ns log-levels
  (:require [clojure.string :as str]))

(defn message
  "Takes a string representing a log line
  and returns its message with whitespace trimmed."
  [s]
  (let [colon-index  (str/index-of s ":")]
    (str/trim (subs s (+ colon-index 1) (count s)))))

(defn log-level
  "Takes a string representing a log line
   and returns its level in lower-case."
  [s]
  (let [open-index (str/index-of s "[")
        close-index (str/index-of s "]")]
    (str/lower-case (subs s (+ open-index 1) close-index))))

(defn reformat
  "Takes a string representing a log line and formats it
  with the message first and the log level in parentheses."
  [s]
  (let [msg (message s)
        level (log-level s)]
    (format "%s (%s)" msg level)
    )
  )
