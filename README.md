# Demo-Microservice-Spring-Boot-Docker

Microservice with Spring Boot and Docker


### Commands

./mvnw clean package

docker build -t micro_spring_boot_docker .

docker run -d -p 8080:8080 micro_spring_boot_docker
