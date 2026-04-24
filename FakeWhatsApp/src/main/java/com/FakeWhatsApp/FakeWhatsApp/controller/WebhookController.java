package com.FakeWhatsApp.FakeWhatsApp.controller;

import com.FakeWhatsApp.FakeWhatsApp.model.MessageRequest;
import com.FakeWhatsApp.FakeWhatsApp.model.MessageResponse;
import com.FakeWhatsApp.FakeWhatsApp.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping
    public MessageResponse receiveMessage(@RequestBody MessageRequest request) {

        System.out.println("Received message: " + request.getMessage());

        String reply = chatService.getReply(request.getMessage());

        return new MessageResponse(reply);
    }
}
