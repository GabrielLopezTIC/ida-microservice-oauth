FROM openjdk:8
VOLUME \tmp
EXPOSE 2222
ADD ./target/Microservice-Oauth-0.0.1-SNAPSHOT.jar Microservice-Oauth.jar
ENTRYPOINT ["java","-jar","/Microservice-Oauth.jar"]