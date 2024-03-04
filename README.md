# my-guardian-suggested-tags

This repo contains a Scala app that defines the suggested tags for My Guardian. On CI/CD the app checks that all of the `SuggestedTag`'s are valid via the [Content API client](https://github.com/guardian/content-api-scala-client)https://github.com/guardian/content-api-scala-client and if all pass the check then the case classes are converted to JSON and uploaded to S3. 
