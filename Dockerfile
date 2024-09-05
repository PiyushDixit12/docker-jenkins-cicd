FROM openjdk:17
EXPOSE 8081
Add target/docker-jenkins-integration-example.jar docker-jenkins-integration-example.jar

ENTRYPOINT ["java","-jar","docker-jenkins-integration-example.jar"]
