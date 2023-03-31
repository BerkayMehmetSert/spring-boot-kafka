package com.bms.springbootkafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MyConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyConsumer.class);

    @KafkaListener(topics = "${app.kafka.topic}", groupId = "${app.kafka.group.id}")
    public void sendMessage(String message) {
        LOGGER.info("Message received: {}", message);
    }
}
