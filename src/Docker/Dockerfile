FROM adoptopenjdk:11-jre-hotspot

WORKDIR /app
COPY target/ecommerce-backend.jar /app

EXPOSE 8080
CMD ["java", "-jar", "ecommerce-backend.jar"]
