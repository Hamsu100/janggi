package com.hms.yut.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class TestController {

    private final SimpMessagingTemplate messagingTemplate;

    public TestController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/test")
    public void testMapping() {


        messagingTemplate.convertAndSend("/topic/test", "Connect Test Complete");
    }
}
