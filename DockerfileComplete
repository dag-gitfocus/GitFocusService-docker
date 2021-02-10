FROM alpine/git
RUN mkdir /app
WORKDIR /app
RUN pwd
RUN ls -l
RUN git clone https://github.com/dag-gitfocus/GitFocusService-docker.git
RUN pwd
RUN ls -l
WORKDIR /app
RUN pwd
RUN ls -l

FROM maven:3.5-jdk-8-alpine as builder
WORKDIR /app/GitFocusService-docker
COPY --from=0 /app/GitFocusService-docker /app/GitFocusService-docker
RUN pwd
RUN ls -l
# Build a release artifact.
RUN mvn package -DskipTests

FROM adoptopenjdk/openjdk8:jdk8u202-b08-alpine-slim
# Copy the jar to the production image from the builder stage.
WORKDIR /app/GitFocusService-docker
COPY --from=builder /app/GitFocusService-docker /app/GitFocusService-docker
ENTRYPOINT ["java", "-jar","/app/GitFocusService-docker/target/gitfocus-service.jar"]

