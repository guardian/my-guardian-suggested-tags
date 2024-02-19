import { App } from "aws-cdk-lib";
import { Template } from "aws-cdk-lib/assertions";
import { MyGuardianSuggestedTags } from "./my-guardian-suggested-tags";

describe("The MyGuardianSuggestedTags stack", () => {
  it("matches the snapshot", () => {
    const app = new App();
    const stack = new MyGuardianSuggestedTags(app, "MyGuardianSuggestedTags", { stack: "mobile", stage: "TEST", app: "my-guardian-suggested-tags-static" },);
    const template = Template.fromStack(stack);
    expect(template.toJSON()).toMatchSnapshot();
  });
});
