FROM openjdk:25-jdk
ADD target/cicd.jar  cicd.jar
ENTRYPOINT ["java", "-jar", "cicd.jar"]