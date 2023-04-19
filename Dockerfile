FROM adoptopenjdk/openjdk12:latest
MAINTAINER arteemtkacheev@gmail.com
COPY service/build/libs/service-1.0.jar discovery-service.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "discovery-service.jar"]
