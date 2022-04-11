FROM openjdk:11
EXPOSE 9530
ADD test.jar test.jar
ENTRYPOINT [ "java","-jar","/test.jar" ]