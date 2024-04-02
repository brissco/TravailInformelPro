package com.modafa.v1.entity;

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
public class UserPreference {
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "userId")
	    private User user;

	    private String preferenceType;
	    private String value;
}
