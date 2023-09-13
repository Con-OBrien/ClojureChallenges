(ns clojure-knowledge.sets)

;Sets are collections of unique values.
(= __ (set '(:a :a :b :c :c :c :c :d :d)))

(= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

;Fill in the blank:
#{:a :b :c :d}