FROM java:8
LABEL maintainer="ankanabasu97@gmail.com"
VOLUME /tmp
EXPOSE 8089
ADD target/Movie-Service-0.0.1-SNAPSHOT.jar Movie-Service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Movie-Service-0.0.1-SNAPSHOT.jar"]