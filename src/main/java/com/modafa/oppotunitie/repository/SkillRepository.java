package com.modafa.oppotunitie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {
}