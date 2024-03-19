package com.modafa.oppotunitie.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {

	User saveUser(User user);
    User getUserById(Integer userId);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Integer userId);
    User findByEmail(String email);
    User login(String email, String password) throws Exception;
}
