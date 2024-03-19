package com.example.demo.entity;



import com.modafa.oppotunitie.Enum1.SkillLevel;

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
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerSkill {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	  


	    @ManyToOne
	    @JoinColumn(name = "skill_id")
	    private Skill skill;

	    @ManyToOne
	    @JoinColumn(name = "worker_id")
	    private Worker worker;
	    @Enumerated(EnumType.STRING)
	    private SkillLevel level;
	    private Integer yearsExperience;
}
