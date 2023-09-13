(ns clojure-knowledge.maps)

;Maps store key-value pairs.
;Both maps and keywords can be used as lookup functions.
;Commas are whitespace.

(= __ ((hash-map :a 10, :b 20, :c 30) :b))

(= __ (:b {:a 10, :b 20, :c 30}))

;Fill in the blank:
20
