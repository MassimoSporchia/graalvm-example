# Use a GraalVM-based JRE image
FROM amazoncorretto:17.0.13-al2023-headless

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]