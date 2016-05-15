#docker run -d -p 8080:8080 -v /usr/bin/docker:/usr/bin/docker -v /var/run/docker.sock:/var/run/docker.sock myjenkins
FROM tomcat:8-jre8
MAINTAINER pengjinfei <312055826@163.com>
ADD ../testdocker.war .
RUN rm -rf webapps/*
RUN mkdir -p webapps/ROOT
RUN unzip testdocker.war -d webapps/ROOT