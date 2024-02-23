FROM openjdk:17

WORKDIR /backend

COPY target/backend.jar /backend

EXPOSE 8070

CMD ["java", "-jar", "/backend/backend.jar"]
