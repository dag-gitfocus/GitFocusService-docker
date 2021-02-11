FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /GitFocus_Service_Deployment
RUN pwd
RUN ls -l
COPY  /target/gitfocus-service.jar  ./
RUN pwd
RUN ls -l
ENTRYPOINT ["java","-jar","/GitFocus_Service_Deployment/gitfocus-service.jar"]
