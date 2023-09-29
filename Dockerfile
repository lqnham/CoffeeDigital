FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY . /app/
RUN ./gradlew build --no-daemon
RUN dir -s
EXPOSE 8080
CMD [ "java", "-jar", "build/libs/CoffeeDigital-0.0.1-SNAPSHOT.jar" ]
