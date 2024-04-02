package com.modafa.v1.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.modafa.v1.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}