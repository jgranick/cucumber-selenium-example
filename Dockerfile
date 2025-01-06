# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17-slim AS build
WORKDIR /app

# Copy the project files to the container
COPY pom.xml .
COPY src ./src
COPY features ./features

# Run Maven build to package the application
RUN mvn clean package -DskipTests

CMD ["mvn", "test"]

# Stage 2: Create a runtime image
# FROM openjdk:17-jdk-slim
# WORKDIR /app

# # Copy the built JAR file from the build stage
# COPY --from=build /app/target/cucumber-selenium-docker-1.0-SNAPSHOT.jar /app/app.jar

# # Set the command to run the tests when the container starts
# CMD ["java", "-jar", "app.jar"]
