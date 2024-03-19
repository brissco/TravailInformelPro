package com.example.demo.controller;


import com.example.demo.entity.UserPreference;
import com.modafa.oppotunitie.service.UserPreferenceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userPreferences")
public class UserPreferenceController {
    private final UserPreferenceService userPreferenceService;

    @Autowired
    public UserPreferenceController(UserPreferenceService userPreferenceService) {
        this.userPreferenceService = userPreferenceService;
    }

    @PostMapping("/")
    public UserPreference saveUserPreference(@RequestBody UserPreference userPreference) {
        return userPreferenceService.saveUserPreference(userPreference);
    }

    @GetMapping("/{id}")
    public UserPreference getUserPreferenceById(@PathVariable Long id) {
        return userPreferenceService.getUserPreferenceById(id);
    }

    @GetMapping("/")
    public List<UserPreference> getAllUserPreferences() {
        return userPreferenceService.getAllUserPreferences();
    }

    @DeleteMapping("/{id}")
    public String deleteUserPreference(@PathVariable Long id) {
        userPreferenceService.deleteUserPreference(id);
        return "User preference removed with ID: " + id;
    }

    @PutMapping("/")
    public UserPreference updateUserPreference(@RequestBody UserPreference userPreference) {
        return userPreferenceService.updateUserPreference(userPreference);
    }
}