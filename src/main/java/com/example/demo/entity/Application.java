package com.example.demo.entity;

import java.time.LocalDateTime;

import com.modafa.oppotunitie.Enum1.ApplicationStatus;

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
@Data
@Builder
public class Application {
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long applicationId;

	    @ManyToOne
	    @JoinColumn(name = "offerId")
	    private JobOffer jobOffer;

	    @ManyToOne
	    @JoinColumn(name = "workerId")
	    private Worker worker;

	    private LocalDateTime applicationDate;
	    @Enumerated(EnumType.STRING)
	    private ApplicationStatus status;
}