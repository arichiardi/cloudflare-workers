import cloudflareWorkers from "../out/cloudflare-workers.js"

export default {
  scheduled: cloudflareWorkers.backblaze.uploadDownloadTokenToSecrets
};
