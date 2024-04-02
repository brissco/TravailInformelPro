package com.modafa.v1.entity;

import com.modafa.v1.enum1.ProficiencyLevel;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LanguageSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String language; // Le nom de la langue

    @Enumerated(EnumType.STRING)
    private ProficiencyLevel proficiencyLevel; // Niveau de maîtrise
    private long poucentage;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker; // La personne qui parle la langue

    // Enumération des niveaux de compétence
  
}
