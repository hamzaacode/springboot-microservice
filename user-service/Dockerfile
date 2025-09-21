# --- Build Stage ---
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copy only pom.xml first (better caching of dependencies)
COPY pom.xml .
RUN mvn -q dependency:go-offline

# Then copy source code
COPY src ./src

# Build application
RUN mvn -q -DskipTests clean package

# --- Runtime Stage ---
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy jar from build stage
COPY --from=build /app/target/*SNAPSHOT*.jar app.jar

# Expose service port
EXPOSE 8082

# Run application
ENTRYPOINT ["java","-jar","/app/app.jar"]