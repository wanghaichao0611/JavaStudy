package com.ActiveMQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class JmsComponent {
    @Autowired
    JmsMessagingTemplate messagingTemplate;
    @Autowired
    Queue queue;
    public void send(Message message){
        messagingTemplate.convertAndSend(this.queue,message);
    }
    @JmsListener(destination = "amq")
    public void receive(Message message){
        System.out.println("receive:"+message);
    }
}
