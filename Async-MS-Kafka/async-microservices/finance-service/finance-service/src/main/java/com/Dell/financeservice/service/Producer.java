package com.Dell.financeservice.service;

import com.Dell.financeservice.types.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class Producer {
    public static final String topic = "new-student-response";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void publishToTopic(Event message) {
        System.out.println("publishing to " + topic);
        this.kafkaTemplate.send(topic, message.toString());

    }
}
