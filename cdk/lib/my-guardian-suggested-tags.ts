import type { GuStackProps } from "@guardian/cdk/lib/constructs/core";
import { GuStack } from "@guardian/cdk/lib/constructs/core";
import { GuS3Bucket } from "@guardian/cdk/lib/constructs/s3";
import type { App } from "aws-cdk-lib";
import { StringParameter } from "aws-cdk-lib/aws-ssm";

export class MyGuardianSuggestedTags extends GuStack {
  constructor(scope: App, id: string, props: GuStackProps) {
    super(scope, id, props);
    const bucket = new GuS3Bucket(this, `${props.app}`, {
      app: props.app as string,
    });

    new StringParameter(this, "MyGuardianSuggestedTagsBucketName", {
      description: "The name of the bucket where the site is hosted",
      parameterName: `/${props.stage}/${props.stack}/${props.app}/bucket-name`,
      stringValue: bucket.bucketName,
    });
  }
}
