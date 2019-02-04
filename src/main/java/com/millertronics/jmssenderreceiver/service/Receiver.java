package com.millertronics.jmssenderreceiver.service;

import com.millertronics.jmssenderreceiver.model.Email;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class Receiver {

    @JmsListener(destination = "mailBox", containerFactory = "myFactory")
    public void receiveMessage(Email email){
        System.out.println("Received <" + email + ">");
    }
}
