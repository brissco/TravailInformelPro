package com.modafa.oppotunitie.service;

import com.example.demo.entity.UserPreference;
import java.util.List;

public interface UserPreferenceService {
    UserPreference saveUserPreference(UserPreference userPreference);
    UserPreference updateUserPreference(UserPreference userPreference);
    void deleteUserPreference(Long id);
    UserPreference getUserPreferenceById(Long id);
    List<UserPreference> getAllUserPreferences();
}