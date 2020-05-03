FROM centos
RUN yum install -y java
VOLUME /tmp
ADD target/microservice-1.0-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/.urandom","-jar","/app.jar"]
