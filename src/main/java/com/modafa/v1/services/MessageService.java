package com.modafa.v1.services;



import java.util.List;

import com.modafa.v1.entity.Message;

public interface MessageService {
    Message saveMessage(Message message);
    Message updateMessage(Message message);
    void deleteMessage(Integer messageId);
    Message getMessageById(Integer messageId);
    List<Message> getAllMessages();
}