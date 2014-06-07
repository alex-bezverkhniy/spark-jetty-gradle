spark-jetty-gradle
=======================

Sample Spark application using Jetty server, built with Gradle

### Requirements

* Gradle 1.12
* JDK 1.8

### License

I have used the Unlicense. Ideas aren't property. Use this code however you want. If you think I deserve credit for code here, feel free to acknowledge the provenance of the ideas you use. But you don't have to.

### Details

The purpose of this repository is to show you how a Gradle + Spark project should be configured so the application you write will run on a web server or servlet container (like jetty).

#### Running the sample

Run this at a prompt:

    gradle jettyRun

The application server will listen on `0.0.0.0:8080` by default. See Spark docs.

#### Recreating from scratch

Run in an empty directory

    gradle init --type basic

Change the `build.gradle` file to look similar to the one here. Create `src/main/java`, and fill it with happiness and sunshine. See the Spark docs.

That's it. Now you have a Spark application that you can flesh out and build with Gradle. See the discussion above about running the sample.

#### Related project

[spark-standalone-gradle](https://github.com/mrhota/spark-standalone-gradle)
