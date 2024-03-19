package com.modafa.oppotunitie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}
