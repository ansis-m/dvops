#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER ansis

# Add the application's jar to the container
COPY target/helloworld-0.0.1-SNAPSHOT.jar helloworld-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/helloworld-0.0.1-SNAPSHOT.jar"]