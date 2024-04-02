package com.modafa.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modafa.v1.entity.Skill;



@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
}