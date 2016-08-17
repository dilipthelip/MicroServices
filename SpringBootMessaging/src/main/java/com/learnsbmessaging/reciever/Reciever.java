package com.learnsbmessaging.reciever;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Reciever {

	@RabbitListener(queues = "TestQ")
    public void processMessage(String content) {
       System.out.println(content);
    }
	
}
