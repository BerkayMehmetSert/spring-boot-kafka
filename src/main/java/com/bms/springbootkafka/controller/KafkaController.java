package com.bms.springbootkafka.controller;

import com.bms.springbootkafka.producer.MyProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final MyProducer myProducer;

    public KafkaController(MyProducer myProducer) {
        this.myProducer = myProducer;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        myProducer.sendMessage(message);
        return "%s sent to the Kafka Topic java_in_use_topic Successfully".formatted(message);
    }
}
