# Use Java 17
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Give execute permission to mvnw
RUN chmod +x mvnw

# Build the application
RUN ./mvnw clean package -DskipTests

# Copy the jar with a fixed name
RUN cp target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run the app
CMD ["java", "-jar", "app.jar"]
