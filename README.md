# Read Me First
## Requirements

For building and running the application you need:
- JDK 11
- Docker
- Gradle
- Intellij

### Run Spring Boot Application

There are several ways to run a Spring Boot application on your local machine.
One way is to execute the `main` method in the `CoffeeDigitalApplication` class from your IDE.

Or run the following command in a terminal:

```shell
./gradlew bootRun
```

### Check app running

```shell
http://localhost:8080/CoffeeDigital/actuator/health
```

### API documentation

```shell
http://localhost:8080/CoffeeDigital/swagger-ui/index.html
```

To run graddle project: stay root folder and use command: 
```shell
./gradlew bootRun
```
To terminate process use: press `Ctrl + C`

#### RUN TESTING
Run Unit test
```shell
./gradlew test
```

### Package

Run the following command:

```shell
./gradlew clean build
```

or run without test:

```shell
./gradlew clean build -x test
```

After build succesfully, we will have a jar file at folder `build/libs`.
To start spring appliation from this jar file, run the following command:

```shell
java -Dspring.profiles.active=dev -jar ./build/libs/CoffeeDigital-0.0.1-SNAPSHOT.jar
```

# SETUP RUN ON MACOS

### Check requirement

Show place install JDK

```shell
java_home -V

/usr/libexec/java_home -V
```

```shell
export PATH=$PATH:/Users/lqnham/Library/Java/JavaVirtualMachines/corretto-17.0.6/Contents/Home/bin
```

### RUN AND DEPLOY WITH DOCKER

- build image ```sudo docker build -t coffeedigital .```

- To check information
  ```docker ps```

- Mapping port
  ```docker run -p [port_your_pc]:[port_docker] [image_name]```

- port_docker: check on Dockerfile
- port_your_pc: any available port


- run image
  ```docker run -p 8080:8080 coffeedigital```

![alt text](version_1.png)