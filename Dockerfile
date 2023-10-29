FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} api-gateway-service.jar
ENTRYPOINT ["java", "-jar", "api-gateway-service.jar"]
EXPOSE 9000