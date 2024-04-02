package com.modafa.v1.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.modafa.v1.enum1.TransactionStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
public class Transaction {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long transactionId;

	    @ManyToOne
	    @JoinColumn(name = "offerId")
	    private JobOffer jobOffer;

	    private BigDecimal amount;
	    private LocalDateTime transactionDate;
	    @Enumerated(EnumType.STRING)
	    private TransactionStatus status;
}