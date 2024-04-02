package com.modafa.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modafa.v1.entity.Application;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}