import "source-map-support/register";
import { App } from "aws-cdk-lib";
import { MyGuardianSuggestedTags } from "../lib/my-guardian-suggested-tags";

const app = new App();

new MyGuardianSuggestedTags(app, "MyGuardianSuggestedTags-CODE", {
  stack: "mobile",
  stage: "CODE",
  env: { region: "eu-west-1" },
  app: "my-guardian-suggested-tags-static",
});

new MyGuardianSuggestedTags(app, "MyGuardianSuggestedTags-PROD", {
  stack: "mobile",
  stage: "PROD",
  env: { region: "eu-west-1" },
  app: "my-guardian-suggested-tags-static",
});