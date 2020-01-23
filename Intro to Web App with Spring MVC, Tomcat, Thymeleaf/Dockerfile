FROM openjdk:8
ADD target/docker-demo-spring-boot.jar docker-demo-spring-boot.jar
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "docker-demo-spring-boot.jar"]
