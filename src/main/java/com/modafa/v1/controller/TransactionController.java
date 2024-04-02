package com.modafa.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.modafa.v1.entity.Transaction;
import com.modafa.v1.services.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/")
    public Transaction saveTransaction(@RequestBody Transaction transaction) {
        return transactionService.saveTransaction(transaction);
    }

    @GetMapping("/{transactionId}")
    public Transaction getTransactionById(@PathVariable Long transactionId) {
        return transactionService.getTransactionById(transactionId);
    }

    @GetMapping("/")
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @DeleteMapping("/{transactionId}")
    public String deleteTransaction(@PathVariable Long transactionId) {
        transactionService.deleteTransaction(transactionId);
        return "Transaction removed with ID: " + transactionId;
    }

    @PutMapping("/")
    public Transaction updateTransaction(@RequestBody Transaction transaction) {
        return transactionService.updateTransaction(transaction);
    }
}