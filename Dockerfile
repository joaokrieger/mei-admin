FROM openjdk:21-slim

WORKDIR /app

COPY target/*.jar app.jar

ENV SPRING_DATASOURCE_URL=jdbc:postgresql://db:5432/fleet_ledger
ENV SPRING_DATASOURCE_USERNAME=postgres
ENV SPRING_DATASOURCE_PASSWORD=123456

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]