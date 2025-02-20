# Build Stage
FROM maven:3.8.5-openjdk-17 as build

WORKDIR /app

# Copy everything from the subfolder (if your pom.xml is not in root)
COPY springboot-appointment-scheduler/pom.xml .
COPY springboot-appointment-scheduler/src ./src

RUN mvn clean package -DskipTests

# Package Stage
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
