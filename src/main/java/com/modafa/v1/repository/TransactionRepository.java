package com.modafa.v1.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.modafa.v1.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}