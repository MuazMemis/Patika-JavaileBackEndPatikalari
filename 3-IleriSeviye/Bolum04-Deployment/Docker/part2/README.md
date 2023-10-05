# Part 2

## Networks

- bridge => `docker run mongo`
- none => `docker run mongo --network=none` // Dışardan erişilemez.
- host => `docker run mongo --network=host` // host un kendisine ait ip si üzerinden erişim sağlanır
- kullanıcı tanımlı
  - `docker network create --driver bridge --subnet

## Commands

```sh
docker rmi my-ubuntu # remove image image_id or image_name

docker network ls
docker network rm my-network

docker inspect bridge # bridge= network_name
docker pull gkandemir/todo-app
docker network create --driver bridge --subnet 182.18.0.1/24 --gateway 182.18.0.1 custom-network
docker inspect 378cea66e86e
docker run --net custom-network --name mongo-server -d mongo
docker run --net custom-network -p 3000:3000 gkandemir/todo-app # 5e44c2a5c701
docker inspect 5e44c2a5c701
docker inspect mongo-server

docker pull ubuntu:18.04
docker run -it ubuntu:18.04
apt-get update
apt-get install curl -y
curl -sL https://deb.nodesource.com/setup_10.x | bash
apt-get install -y nodejs
cd opt
mkdir node-app
cd node-app/
echo 'console.log("nodejsapp from ubuntu...");' > index.js
cat index.js
node index.js

# 1-node-app-ubuntu
docker build . # klasör içindeki Dockerfile
docker build . -f dockerconfig # farklı bir dockerfile kullanmak için
docker build . -t simple-node-app # image name
docker images
docker run simple-node-app

# 2-node-app
docker build . -t simple-node-app-2
docker run simple-node-app-2
docker rmi simple-node-app-2

# 3-node-server
docker build . -t simple-node-server
docker run simple-node-server

# 4-php-app
docker build . -t simple-php-app
docker run -p 8080:80 simple-php-app
# http://localhost:8080 | http://localhost:8080/index.php

# 5-node-mongo-todo
docker build . -t todo-app
docker stop 584e6dacceef
docker rm mongo-server
docker run --name mongo-server -p 27017:27017 -d mongo
docker run --link mongo-server:mongo-alias -p 4000:4000 todo-app

# 6-cmd-entrypoint
docker run ubuttu # açılıp kapanmasının sebebi container çalıştıracağı bir process olmaması. Bu durumda container kendini kapatır.
docker build . -t ubuntu-sleeper
docker run ubuntu-sleeper
docker run ubuntu-sleeper sleep 1 # dockerfile daki cmd kodunu ezer
docker run ubuntu-sleeper 2 # entrypoint

```
