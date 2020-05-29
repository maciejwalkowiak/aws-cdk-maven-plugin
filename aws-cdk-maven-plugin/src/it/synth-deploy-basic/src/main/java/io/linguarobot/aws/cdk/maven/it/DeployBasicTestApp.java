package io.linguarobot.aws.cdk.maven.it;

import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.Environment;
import software.amazon.awscdk.core.StackProps;


public class DeployBasicTestApp {

    public static void main(String[] args) {
        App app = new App();
        new DeployBasicTestStack(app, "synth-deploy-basic-test-stack");
        app.synth();
    }

}