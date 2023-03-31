# Spring Boot Kafka Example

This project is an example of how to integrate Apache Kafka with a Spring Boot application. It includes a Kafka producer
and consumer that communicate through a Kafka topic.

## Setup

To run this project, you'll need to have Kafka and Zookeeper installed on your machine. You can use Docker to set them
up quickly by running the following command:

```bash
docker-compose up -d
```

Once Kafka and Zookeeper are up and running, you can start the Spring Boot application by running the following command:

```bash
./mvnw spring-boot:run
```

## Configuration

The Kafka configuration is defined in the KafkaConfig class. It sets up the Kafka producer and consumer using the
DefaultKafkaProducerFactory, DefaultKafkaConsumerFactory, and ConcurrentKafkaListenerContainerFactory classes provided
by the Spring Kafka library. The Kafka properties, such as the bootstrap servers, serializer, deserializer, group ID,
and topic, are defined in the KafkaConstants class.

The MyProducer class is a Spring service that sends messages to the Kafka topic using the KafkaTemplate provided by the
Spring Kafka library. The MyConsumer class is another Spring service that listens to the Kafka topic using the
@KafkaListener annotation provided by the Spring Kafka library.

## Usage

You can send a message to the Kafka topic by making a GET request to the /kafka/send endpoint with the message as a
query parameter. For example, if you want to send the message "Hello, Kafka!", you can make the following request:

```bash
GET /kafka/send?message=Hello%2C%20Kafka%21 HTTP/1.1
Host: localhost:8080
```

The Kafka consumer will log the message received in the console.

## Conclusion

This project provides a basic example of how to integrate Apache Kafka with a Spring Boot application. You can use it as
a starting point for building more complex Kafka-based applications.