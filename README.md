# Java Demo Application using Gradle and Spring

This is an example application showcasing how to run a Java app.

This application uses the following tools: 

* Gradle
* Java 11
* PostgreSQL
* Spring Boot
* Thymeleaf

## Local Development

### Starting the application

Start up a PostgreSQL Database Docker container:

```
docker run -e POSTGRES_USER=postgres -e POSTGRES_DB=awesome_test -p 5432:5432 -itd circleci/postgres:12-alpine
```

Start up the Java application:

```
./gradlew bootRun
```

Navigate to http://localhost:8080

![Screenshot of index page](assets/index.png?raw=true "Screenshot of index page")

## License

Copyright © 2019 AwesomeCI

Distributed under the MIT license, see the file LICENSE.
