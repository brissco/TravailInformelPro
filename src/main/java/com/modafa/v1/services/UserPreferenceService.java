package com.modafa.v1.services;


import java.util.List;

import com.modafa.v1.entity.UserPreference;

public interface UserPreferenceService {
    UserPreference saveUserPreference(UserPreference userPreference);
    UserPreference updateUserPreference(UserPreference userPreference);
    void deleteUserPreference(Long id);
    UserPreference getUserPreferenceById(Long id);
    List<UserPreference> getAllUserPreferences();
}