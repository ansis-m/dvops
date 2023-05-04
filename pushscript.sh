#!/bin/bash

docker tag cards ansism/cards
docker push ansism/cards

docker tag accounts ansism/accounts
docker push ansism/accounts

docker tag loans ansism/loans
docker push ansism/loans

docker tag config ansism/config
docker push ansism/config

docker tag helloworld ansism/helloworld
docker push ansism/helloworld