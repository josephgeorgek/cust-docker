#FROM openjdk:8-jdk-alpine
FROM maslick/minimalka:jdk11
VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo-0.0.1-SNAPSHOT.jar"]