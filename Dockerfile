# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper and make it executable
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw

# Download dependencies
RUN ./mvnw dependency:resolve

# Copy the rest of the project files to the container
COPY . .

# Package the application
RUN ./mvnw package -DskipTests

# Expose the application port
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]
