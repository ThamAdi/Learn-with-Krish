package com.Dell.financeservice.service;

import com.google.gson.Gson;
import com.Dell.financeservice.types.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class Consumer {

    @Autowired
    Producer producer;

    @KafkaListener(topics = "new-student", groupId = "finance-group")
    public void readFromTopic(String message) throws InterruptedException {
        System.out.println("incomming message is " + message);
        Event event= new Gson().fromJson(message,Event.class);
        if(event.getType().equals("VERIFICATION_COMPLETE")){

            Thread.sleep(10000);
            producer.publishToTopic(new Event("finance-service","payment-complete",event.getKey(),"success"));
        }else{
            System.out.println("Event is not related to verification. process ignored");
        }


    }
}
