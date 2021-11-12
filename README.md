# events-consumer Project

This project uses Quarkus, Java 11 and Maven 3.8

In order to reproduce the error run mvn clean install inside the events-commons directory 
in order to get the dependency jar.

Then go back to root directory and run
mvn compile quarkus:dev 

Important to note that the dependency io.eventuate.tram.core:eventuate-tram-quarkus-consumer-kafka
does not work in this case as this project is intended to be used with a CDC working with Zookeeper and RabbitMQ
and not Kafka as intended with the dependency mentioned above.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```