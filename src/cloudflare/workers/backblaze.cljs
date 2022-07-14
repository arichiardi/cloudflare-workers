(ns cloudflare.workers.backblaze)

(def +println-prefix+ "[upload-download-token-to-secrets]")

(defn ^:export upload-download-token-to-secrets
  [controller env ctx]
  (println +println-prefix+ "Running...")
  (println +println-prefix+ "FFFFF...")
  (js/console.dir controller)
  (js/console.dir env)
  (js/console.dir ctx)
  (.waitUntil
   ctx
   (js/Promise.resolve #js {"foo" "bar"})))
