FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} test-app.jar
ENTRYPOINT ["java","-jar","/test-app.jar"]