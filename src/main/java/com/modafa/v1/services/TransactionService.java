package com.modafa.v1.services;


import java.util.List;

import com.modafa.v1.entity.Transaction;

public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);
    Transaction updateTransaction(Transaction transaction);
    void deleteTransaction(Long transactionId);
    Transaction getTransactionById(Long transactionId);
    List<Transaction> getAllTransactions();
}