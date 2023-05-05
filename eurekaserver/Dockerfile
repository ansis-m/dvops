#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

RUN apt-get update && apt-get install -y curl
CMD /bin/bash

#Information around who maintains the image
MAINTAINER ansis

# Add the application's jar to the container
COPY target/eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/eurekaserver-0.0.1-SNAPSHOT.jar"]