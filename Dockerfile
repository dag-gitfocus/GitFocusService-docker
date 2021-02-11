FROM adoptopenjdk/openjdk11:alpine-jre
RUN pwd
RUN ls -l
ENTRYPOINT ["java","-jar","/var/jenkins_home/workspace/GitFocus_Service_Deployment/target/gitfocus-service.jar"]
