package com.modafa.oppotunitie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Integer> {
	}