package com.bms.springbootkafka.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KafkaConstants {
    public static String bootstrapServers;
    public static String groupId;
    public static String topic;

    @Value("${app.kafka.bootstrap.servers}")
    public void setBootstrapServers(String bootstrapServers) {
        KafkaConstants.bootstrapServers = bootstrapServers;
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
