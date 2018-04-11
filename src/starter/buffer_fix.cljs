(ns starter.buffer-fix
  (:require ["buffer" :refer (Buffer)]))

(js/goog.exportSymbol "Buffer" Buffer)

