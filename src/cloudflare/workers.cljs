(ns cloudflare.workers
  (:require [cloudflare.workers.backblaze :as backblaze]))

(def ^:export exports
  #js {:backblaze
       #js {:uploadDownloadTokenToSecrets backblaze/upload-download-token-to-secrets}})
