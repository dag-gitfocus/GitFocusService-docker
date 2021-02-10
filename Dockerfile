FROM adoptopenjdk/openjdk11:alpine-jre
ENTRYPOINT ["java","-jar","/var/jenkins_home/workspace/GitFocus_Service_Deployment/target/gitfocus-service.jar"]
