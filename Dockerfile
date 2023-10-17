FROM eclipse-temurin:17-jdk-alpine
VOLUME /app
COPY target/g_240123_m_be_docker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]