package com.modafa.oppotunitie.service;


import com.example.demo.entity.Message;
import java.util.List;

public interface MessageService {
    Message saveMessage(Message message);
    Message updateMessage(Message message);
    void deleteMessage(Integer messageId);
    Message getMessageById(Integer messageId);
    List<Message> getAllMessages();
}