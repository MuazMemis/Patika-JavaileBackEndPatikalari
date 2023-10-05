# docker run ubuntu:18.04
FROM ubuntu:18.04

RUN apt-get update
RUN apt-get install -y curl
RUN curl -sL https://deb.nodesource.com/setup_10.x | bash -
RUN apt-get install -y nodejs

WORKDIR /opt/node-app/

# COPY . /opt/node-app/
COPY index.js .

ENV channel=kablosuzkedi

# CMD [ "node", "/opt/node-appindex.js" ];
CMD [ "node", "index.js" ];