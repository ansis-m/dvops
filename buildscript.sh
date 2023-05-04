#!/bin/bash

printf "listing running containers....\n"
docker ps


#printf "\nstoping containers...\n"
#docker stop $(docker ps -a -q)


printf "\n compiling...\n"
mvn -f ./accounts/pom.xml install -Dmaven.test.skip=true
mvn -f ./cards/pom.xml install -Dmaven.test.skip=true
mvn -f ./config/pom.xml install -Dmaven.test.skip=true
mvn -f ./helloworld/pom.xml install -Dmaven.test.skip=true
mvn -f ./loans/pom.xml install -Dmaven.test.skip=true

#
printf "\n building images...\n"
docker build --cache-from accounts ./accounts -t accounts
docker build --cache-from cards ./cards -t cards
docker build --cache-from loans ./loans -t loans
docker build --cache-from helloworld ./helloworld -t helloworld
docker build --cache-from config ./config -t config


printf "\n running docker compose...\n"
docker compose up --detach

