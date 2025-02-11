package com.modafa.v1.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
	
	@OneToMany(mappedBy = "worker")
    private List<CV> cvs;

	@OneToOne
    @JoinColumn(name = "user_id")
    private User user;
	@OneToMany(mappedBy = "worker")
    private List<LanguageSkill> languageSkills; // Ajout pour gérer les compétences linguistiques
	 @OneToMany(mappedBy = "worker")
	    private List<PortFolio> portfolios;
	   private Float averageRating;
	   private BigDecimal hourlyRate;
	   private Boolean availability;
	   private String languages;

	   @OneToMany(mappedBy = "worker")
	   private List<WorkerSkill> skills;

}