package com.modafa.v1.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modafa.v1.entity.Message;
import com.modafa.v1.repository.MessageRepository;
import com.modafa.v1.services.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public Message updateMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void deleteMessage(Integer messageId) {
        messageRepository.deleteById(messageId);
    }

    @Override
    public Message getMessageById(Integer messageId) {
        return messageRepository.findById(messageId).orElse(null);
    }

    @Override
    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}