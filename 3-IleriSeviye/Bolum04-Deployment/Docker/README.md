# Part 1

[github link](https://github.com/gkandemi/docker)

## Commands

```sh
docker pull ubuntu
docker pull mongo
docker images

docker run redis # Image yoksa indirir. Varsa direk çalıştırır.
docker run ubuntu sleep 3 # 3 sn sonra container kendisini kapatır

docker run -it ubuntu # it= interactive terminal
cat etc/os-release
exit

docker ps | docker container ls # container list
docker ps -a | docker container ls -a # geçmişe yönelik çalışan kapalı olan container ları listeler
ps -ef # çalışan process leri listeler

docker run -it --name bash_ubuntu ubuntu
docker ps

docker start bash_ubuntu
docker ps
docker stop bash_ubuntu

docker stop [container_id] | docker stop 472b2afea627 # ilk iki karakterini yazmak yeterli. id ler unique

docker rm [container_name] | docker rm [container_id]
docker rm mystifying_blackwell | docker rm 5f8fb6496f9e
docker rm ea 9e 57 d0 da 3d 46 cb 5e b0 8c 93 # container id ilk iki karakterini yazarak toplu silinebilir
docker container ls -aq # container id lerini listeler
docker container rm $(docker container ls -aq) # bütün container ları siler
docker container rm $(docker ps -aq) # bütün container ları siler

docker run redis:5 # version

docker image tag ubuntu my-ubuntu # docker image tag [image_name/image_id] [your_tag_name]
docker images
docker run -it my-ubuntu
cat etc/os-release
docker ps -a # image= my-ubuntu

docker run -d redis # arka planda çalışır. f93ccb1da4e1
docker attach f9 # o andan itibaren akan loglar görüntülenir

docker run gkandemir/counter-app
docker ps # 5f43d983e4e9
docker stop 5f43d983e4e9

docker run -d gkandemir/counter-app
docker ps # ac96995af944
docker attach ac
docker stop ac # birden fazla id vererek çoklu stop yapılabilir.

docker run -d gkandemir/counter-app
docker container logs [container_id/container_name]
docker container logs 1284e6383c0d # varolan loglar görüntülenir
dcoker stop 12

docker pull gkandemir/interactive-terminal-app
docker run gkandemir/interactive-terminal-app
docker run -it gkandemir/interactive-terminal-app

docker run -p [DIS_PORT/IC_PORT] mongo
docker run -p 27018:27017 mongo
docker run -p 27017:27017 mongo
docker run gkandemir/node-app
docker run -p 3000:3000 gkandemir/node-app
docker run -d -p 3001:3000 gkandemir/node-app
docker run -d -p 3002:3000 gkandemir/node-app
docker stop $(docker ps -aq) # hepsini durdurur

# Docker desktop -> settings -> Recources -> File sharing -> add /opt/data
sudo chown user:usergroup /opt/data
docker run -d -v /opt/data:/data/db -p 27017:27017 mongo # 1fb653e9510e
docker inspect [container_id/container_name]
docker inspect [image_id/image_name]
docker inspect 1fb653e9510e

docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=test123 -d mysql
docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=test123 -p 3306:3306 -d mysql
docker run --name pmyadmin -p 8000:80 --link mysql-server:db -d phpmyadmin/phpmyadmin
docker stop mysql-server pmyadmin
docker rm mysql-server pmyadmin

docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=test123 -p 3306:3306 -v /opt/data:/etc/mysql/conf.d -d mysql
docker run --name pmyadmin -p 8000:80 --link mysql-server:db -d phpmyadmin/phpmyadmin

```
