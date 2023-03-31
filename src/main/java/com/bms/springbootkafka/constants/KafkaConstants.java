package com.bms.springbootkafka.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KafkaConstants {
    public static String bootstrapServers;
    public static String keySerializer;
    public static String valueSerializer;
    public static String keyDeserializer;
    public static String valueDeserializer;
    public static String groupId;
    public static String topic;

    @Value("${app.kafka.bootstrap.servers}")
    public void setBootstrapServers(String bootstrapServers) {
        KafkaConstants.bootstrapServers = bootstrapServers;
    }

    @Value("${app.kafka.key.serializer}")
    public void setKeySerializer(String keySerializer) {
        KafkaConstants.keySerializer = keySerializer;
    }

    @Value("${app.kafka.value.serializer}")
    public void setValueSerializer(String valueSerializer) {
        KafkaConstants.valueSerializer = valueSerializer;
    }

    @Value("${app.kafka.key.deserializer}")
    public void setKeyDeserializer(String keyDeserializer) {
        KafkaConstants.keyDeserializer = keyDeserializer;
    }

    @Value("${app.kafka.value.deserializer}")
    public void setValueDeserializer(String valueDeserializer) {
        KafkaConstants.valueDeserializer = valueDeserializer;
    }

    @Value("${app.kafka.group.id}")
    public void setGroupId(String groupId) {
        KafkaConstants.groupId = groupId;
    }

    @Value("${app.kafka.topic}")
    public void setTopic(String topic) {
        KafkaConstants.topic = topic;
    }
}
