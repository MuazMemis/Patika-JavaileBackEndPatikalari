# Part 3

## Commands

```sh
# 7-python-app
docker build . -t python-app
docker run -p 3000:5000 python-app

# 8-vue-app-docker-file
docker build . -t vue-app
docker run -p 9000:8080 vue-app
# http://localhost:9000

docker container prune # çalışmayan bütün containerları siler

# 9-docker-compose/1-node-server
docker-compose build
docker-compose up
# http://localhost:3001

# 9-docker-compose/2-todo-app
docker-compose down
# http://localhost:3000


# 9-docker-compose/3-file-uploader
docker-compose up
# http://localhost:3000
# http://localhost:3000/image/show/1681741536902.png # yeni eklenen img uploads klasörüne yüklenmediği için görüntülenemedi
# http://localhost:3000/image/show/1613692994917.jpg


# 9-docker-compose/4-wordpress
docker-compose up

```
