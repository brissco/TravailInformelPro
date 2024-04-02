package com.modafa.v1.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
public class Evaluation {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long evaluationId;

	    @OneToOne
	    @JoinColumn(name = "offerId")
	    private JobOffer jobOffer;

	    @ManyToOne
	    @JoinColumn(name = "workerId")
	    private Worker worker;

	    private Integer rating;
	    @Lob
	    private String comment;
	    private LocalDateTime evaluationDate;
}