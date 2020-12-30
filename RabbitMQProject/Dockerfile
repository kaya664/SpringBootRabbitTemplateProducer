FROM openjdk:12
EXPOSE 8080
ADD /target/RabbitMQProject-0.0.1-SNAPSHOT.jar kayastd/rabbitmqproducer.jar
ENTRYPOINT ["java","-jar","kayastd/rabbitmqproducer.jar"]