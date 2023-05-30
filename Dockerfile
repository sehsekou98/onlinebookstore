FROM eclipse-temurin:17
WORKDIR workspace
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} sekoubookstore.jar
ENTRYPOINT ["java", "-jar", "sekoubookstore.jar"]
