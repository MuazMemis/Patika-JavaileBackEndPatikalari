# Part 4

## Commands

```sh

ssh root@ip-adress

sudo apt-get update
sudo apt-get install \
    ca-certificates \
    curl \
    gnupg

apt install docker.io -y
docker --version
apt install docker-compose -y
docker-compose --version
systmctl status docker

cd tmp
mkdir wep-apps
cd wep-apps
vi docker-compose.yml
mkdir videomeet
mv docker-compose.yml videomeet
cd videomeet
cat docker-compose.yml
docker-compose up -d

apt install nginx
unlink /etc/nginx/sites-enabled/default
cd /etc/nginx/sites-available
vi reverse-proxy.conf
```

```sh
server {
        listen 80;
        listen [::]:80;
        server_name videomeet.app;
        server_name_in_redirect off;

        access_log /var/log/nginx/reverse-access.log;
        error_log /var/log/nginx/reverse-error.log;

        location / {
            proxy_set_header Client-IP $remote_addr;
            proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
            proxy_set_header Host $host;
            proxy_pass http://127.0.0.1:8080;
        }
}

server {
        listen 80;
        listen [::]:80;
        server_name talkinghead.app;
        server_name_in_redirect off;

        access_log /var/log/nginx/reverse-access.log;
        error_log /var/log/nginx/reverse-error.log;

        location / {
            proxy_set_header Client-IP $remote_addr;
            proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
            proxy_set_header Host $host;
            proxy_pass http://127.0.0.1:8090;
        }
}
```

```sh
ln -s /etc/nginx/sites-available/reverse-proxy.conf /etc/nginx/sites-enabled/reverse-proxy.conf
nginx -t
systemctl restart nginx
systemctl status nginx
```
