package com.modafa.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.modafa.v1.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}

