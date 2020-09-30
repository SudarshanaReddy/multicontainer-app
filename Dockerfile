FROM openjdk:11
COPY ./target/multicontainer-app-0.0.1-SNAPSHOT.jar /usr/src/multicontainer-app-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src
ENTRYPOINT ["java","-jar", "multicontainer-app-0.0.1-SNAPSHOT.jar"]