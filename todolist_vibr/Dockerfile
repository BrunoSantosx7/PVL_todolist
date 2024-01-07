# Verwende das offizielle OpenJDK-Image als Basisimage
FROM openjdk:17-jdk

# Setze den Arbeitsverzeichnis innerhalb des Containers
WORKDIR /app

# Kopiere die JAR-Datei deiner Spring Boot-Anwendung ins Arbeitsverzeichnis
COPY target/*.jar app.jar

# Exponiere den Port, den deine Spring Boot-Anwendung verwenden wird
EXPOSE 8080

# Starte deine Spring Boot-Anwendung beim Start des Containers
CMD ["java", "-jar", "app.jar"]
