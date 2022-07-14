# Cloudflare Workers

Various workers that I need in personal projects.

## Development

The current implementation relies on [ClojureScript](https://clojurescript.org/).

You'll need one terminal per command.

### Compile ClojureScript

In the project root:

``` shell
$ npm run watch

> cloudflare-workers@0.0.1 watch
> shadow-cljs watch workers

shadow-cljs - config: /home/cokap/git/cloudflare-workers/shadow-cljs.edn
shadow-cljs - server version
...
```

### Bundle

``` shell
$ cd backblaze-download-token-to-secrets # or any other worker folder
$ npm run watch

> backblaze-download-token-to-secrets@0.0.1 watch
> esbuild main.js --watch --bundle --platform=neutral --keep-names --format=esm --define:process.env.NODE_ENV="dev" --define:window=global --outfile=./out/bundle.js
...
```

### Launch local server

We take advantage of [wrangler](https://github.com/cloudflare/wrangler2)'s development server:

``` shell
$ cd backblaze-download-token-to-secrets # or any other worker folder
$ npm run dev

> backblaze-download-token-to-secrets@0.0.1 dev
> wrangler dev --local
...
```

### Try it out

You can use `curl` for triggering the desired workers, for instance this is what you would run for a [Scheduled](https://developers.cloudflare.com/workers/runtime-apis/scheduled-event/) worker.

``` shell
$ curl "http://localhost:8787/cdn-cgi/mf/scheduled"
```

Check the [miniflare](https://miniflare.dev/core) documentation for more info.
