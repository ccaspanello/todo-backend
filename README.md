# TODO Backend

## Developing
Import `pom.xml` into IntelliJ
Click the Debug button


## Building Docker Image
```
mvn clean spring-boot:build-image
```

## Running Docker Image
```
docker run -it --rm /
  -p 8080:8080 /
  -e APP_FRONTEND-URL=http://localhost:8081 /
  todo-backend:1.0.0-SNAPSHOT
```
APP_FRONTEND_URL - Defines where your Frontend URL is for CORS configuration