package com.modafa.v1.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.modafa.v1.entity.Message;
import com.modafa.v1.services.MessageService;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/")
    public Message saveMessage(@RequestBody Message message) {
        return messageService.saveMessage(message);
    }

    @GetMapping("/{messageId}")
    public Message getMessageById(@PathVariable Integer messageId) {
        return messageService.getMessageById(messageId);
    }

    @GetMapping("/")
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @DeleteMapping("/{messageId}")
    public String deleteMessage(@PathVariable Integer messageId) {
        messageService.deleteMessage(messageId);
        return "Message removed with ID: " + messageId;
    }

    @PutMapping("/")
    public Message updateMessage(@RequestBody Message message) {
        return messageService.updateMessage(message);
    }
}