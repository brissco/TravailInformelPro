package com.modafa.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modafa.v1.entity.UserPreference;

public interface UserPreferenceRepository extends JpaRepository<UserPreference, Long> {
}