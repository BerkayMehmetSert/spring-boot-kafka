package com.bms.springbootkafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import static com.bms.springbootkafka.constants.KafkaConstants.*;

@Service
public class MyProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public MyProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        kafkaTemplate.send(topic, message);
    }
}
