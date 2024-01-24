FROM eclipse-temurin:21.0.1_12-jdk-jammy

COPY . .

RUN ./mvnw clean install -DskipTests

ENTRYPOINT [ "java", "-jar", "target/tech-store-0.0.1-SNAPSHOT.jar" ]