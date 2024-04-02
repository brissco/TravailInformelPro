package com.modafa.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modafa.v1.entity.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {
}