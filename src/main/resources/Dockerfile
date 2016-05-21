#docker run -d -p 8080:8080 -v /usr/bin/docker:/usr/bin/docker -v /var/run/docker.sock:/var/run/docker.sock -v /lib64/libdevmapper.so.1.02:/usr/lib/libdevmapper.so.1.02 -v /lib64/libudev.so.0:/usr/lib/libudev.so.0 myjenkins
FROM pengjinfei/tomcat
MAINTAINER pengjinfei <312055826@163.com>
#http://download.oracle.com/otn-pub/java/jdk/8u91-b14/jdk-8u91-linux-x64.tar.gz
#RUN apt-get purge -y openjdk*
#ADD http://download.oracle.com/otn-pub/java/jdk/8u91-b14/jdk-8u91-linux-x64.tar.gz /usr/java/
#RUN wget -P /usr/java/ --no-cookies --header "Cookie: oraclelicense=accept-securebackup-cookie;" \
#    http://download.oracle.com/otn-pub/java/jdk/8u91-b14/jdk-8u91-linux-x64.tar.gz 2>/dev/null
#RUN tar -zxf /usr/java/jdk-8u91-linux-x64.tar.gz -C /usr/java/
#ENV JAVA_HOME /usr/java/jdk1.8.0_91
#ENV PATH $PATH:$JAVA_HOME/bin
#docker images|grep none|awk '{print $3}'|xargs docker rmi
COPY testdocker.war /usr/local/tomcat/
WORKDIR /usr/local/tomcat
RUN rm -rf /usr/local/tomcat/webapps/* && \
    mkdir -p /usr/local/tomcat/webapps/ROOT && \
    unzip testdocker.war -d webapps/ROOT