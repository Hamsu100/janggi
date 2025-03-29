package com.hms.yut.controller;


import com.hms.yut.vo.Location;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class YutController {

    private final SimpMessagingTemplate messagingTemplate;

    public YutController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/sync/{roomNumber}")
    public void handleMessage(Location loc, @DestinationVariable String roomNumber) {
        System.out.println(roomNumber);
        System.out.println(loc);
        String destination = "/topic/messages/" + roomNumber;
        Location retLoc = loc.reverse();
        System.out.println(retLoc);
        messagingTemplate.convertAndSend(destination, retLoc);
    }
}
