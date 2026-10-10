# BharatBasket

BharatBasket is a local online shopping app built with Java 17, Spring Boot,
JavaFX, and PostgreSQL.

## Requirements

- JDK 17
- Maven 3.8+
- PostgreSQL (optional for starting the API; required when database features are used)

## Run the API

```sh
mvn spring-boot:run
```

The API exposes `GET /api/health`.

Configure PostgreSQL with `SPRING_DATASOURCE_URL`,
`SPRING_DATASOURCE_USERNAME`, and `SPRING_DATASOURCE_PASSWORD`. The URL and
username defaults target a local `bharatbasket` database.

## Run the desktop UI

```sh
mvn javafx:run
```
