package com.example.demo.entity;


import jakarta.persistence.Entity;
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
public class JobOfferSkill {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    private Integer skillId;

	    @ManyToOne
	    @JoinColumn(name = "offerId") // Assurez-vous que cela correspond au nom de la colonne clé étrangère dans la base de données.
	    private JobOffer jobOffer;
	    
	    @ManyToOne
	    @JoinColumn(name = "skillId", insertable = false, updatable = false)
	    private Skill skill;
}