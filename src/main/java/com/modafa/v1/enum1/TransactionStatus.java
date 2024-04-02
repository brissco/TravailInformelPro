package com.modafa.v1.enum1;

public enum TransactionStatus {
    PENDING, // Transaction has been initiated but not yet completed
    COMPLETED, // Transaction has been successfully completed
    FAILED, // Transaction has failed due to an error or rejection
    CANCELED // Transaction has been canceled before completion
}