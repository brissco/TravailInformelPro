package com.modafa.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modafa.v1.entity.Employer;


@Repository
public interface EmployerRepository extends JpaRepository<Employer, Integer> {
	}