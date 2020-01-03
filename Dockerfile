FROM registry.redhat.io/redhat-openjdk-18/openjdk18-openshift
EXPOSE 8080
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","app.jar"]