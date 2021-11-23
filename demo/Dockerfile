FROM openjdk:11-jre-slim
WORKDIR /home
ENV TZ="America/Lima"
COPY /target/demo-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "demo.jar"]