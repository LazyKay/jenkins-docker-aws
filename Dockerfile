FROM openjdk:8-jdk-alpine
#FROM adoptopenjdk/openjdk11:alpine-jre
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
VOLUME /tmp
ARG JAR_FILE=target/spring-boot-docker.jar
#COPY ${JAR_FILE} spring-boot-docker.jar
ADD ${JAR_FILE} spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]
#EXPOSE 2222
EXPOSE 8090