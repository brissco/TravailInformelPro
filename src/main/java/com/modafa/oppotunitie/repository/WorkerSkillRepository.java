package com.modafa.oppotunitie.repository;

import com.example.demo.entity.WorkerSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerSkillRepository extends JpaRepository<WorkerSkill, Long> {
}