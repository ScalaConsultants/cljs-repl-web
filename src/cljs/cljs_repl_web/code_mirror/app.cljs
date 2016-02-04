(ns cljs-repl-web.code-mirror.app)

(defn console-instance
  [db k]
  (get-in db [:consoles (name k) :cm-inst]))

(defn console-items
  [db k]
  (get-in db [:consoles (name k) :items]))

(defn console-history
  [db k]
  (get-in db [:consoles (name k) :history]))

(defn console-history-pos
  [db k]
  (get-in db [:consoles (name k) :hist-pos]))
