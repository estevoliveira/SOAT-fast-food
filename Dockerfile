FROM alpine:latest

RUN apk update && apk upgrade

RUN echo "http://dl-cdn.alpinelinux.org/alpine/v3.15/main" >> /etc/apk/repositories \
    && echo "http://dl-cdn.alpinelinux.org/alpine/v3.15/community" >> /etc/apk/repositories \
    && apk add --no-cache openjdk21-jdk

WORKDIR /app

COPY target/soatFastFood-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT ["java","-jar","soatFastFood-0.0.1-SNAPSHOT.jar"]