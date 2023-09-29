### BUILD image
#FROM gradle:7.2-jdk11 AS builder
#WORKDIR /app
#COPY . /app/
#RUN gradle build --no-daemon

FROM adoptopenjdk/adoptopenjdk:11-jre-hotspot-arm64
WORKDIR /app
COPY --from=builder /app/build/libs/CoffeeDigital-0.0.1-SNAPSHOT.jar /app/CoffeeDigital-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD [ "java", "-jar", "/app/CoffeeDigital-0.0.1-SNAPSHOT.jar" ]