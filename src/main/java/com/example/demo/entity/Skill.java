package com.example.demo.entity;

import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
public class Skill {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer skillId;

	    @Column(name = "skill_name")
	    private String name;
	    private String category;

	    @OneToMany(mappedBy = "skill")
	    private List<WorkerSkill> workerSkills;

	    @OneToMany(mappedBy = "skill")
	    private List<JobOfferSkill> jobOfferSkills;
}