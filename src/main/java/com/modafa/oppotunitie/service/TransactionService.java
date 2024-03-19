package com.modafa.oppotunitie.service;

import com.example.demo.entity.Transaction;
import java.util.List;

public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);
    Transaction updateTransaction(Transaction transaction);
    void deleteTransaction(Long transactionId);
    Transaction getTransactionById(Long transactionId);
    List<Transaction> getAllTransactions();
}