FROM eclipse-temurin:17.0.12_7-jdk
WORKDIR /app
COPY target/hello_devops-0.0.1-SNAPSHOT.jar hello_devops.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/hello_devops.jar"]

