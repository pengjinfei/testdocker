#docker run -d -p 8080:8080 -v /usr/bin/docker:/usr/bin/docker -v /var/run/docker.sock:/var/run/docker.sock -v /lib64/libdevmapper.so.1.02:/usr/lib/libdevmapper.so.1.02 -v /lib64/libudev.so.0:/usr/lib/libudev.so.0 myjenkins
FROM tomcat:8-jre8
MAINTAINER pengjinfei <312055826@163.com>
COPY testdocker.war .
RUN rm -rf webapps/* && \
    mkdir -p webapps/ROOT && \
    unzip testdocker.war -d webapps/ROOT