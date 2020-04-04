package com.stt.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutReceiverC {

    @RabbitHandler
    @RabbitListener(queues = "fanout.C")
    public void process(String message) {
        System.out.println("fanout Receiver C: " + message);
    }

}
