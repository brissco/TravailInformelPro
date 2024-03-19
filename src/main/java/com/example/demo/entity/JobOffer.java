package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.modafa.oppotunitie.Enum1.OfferStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
public class JobOffer {
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long offerId;

	    @ManyToOne
	    @JoinColumn(name = "employerId")
	    private Employer employer;

	    private String title;
	    @Lob
	    private String description;
	    private String location;
	    private BigDecimal budget;
	    private LocalDateTime startDate;
	    private Integer duration;
	    @Enumerated(EnumType.STRING)
	    private OfferStatus status;

	    @OneToMany(mappedBy = "jobOffer")
	    private List<JobOfferSkill> jobOfferSkills;

	    @OneToMany(mappedBy = "jobOffer")
	    private List<Application> applications;

	    // Assuming a One-to-One relationship with Evaluation and Transaction
	    @OneToOne(mappedBy = "jobOffer")
	    private Evaluation evaluation;

	    @OneToOne(mappedBy = "jobOffer")
	    private Transaction transaction;
}