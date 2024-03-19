package com.modafa.oppotunitie.serviceImpl;


import com.example.demo.entity.UserPreference;
import com.modafa.oppotunitie.repository.UserPreferenceRepository;
import com.modafa.oppotunitie.service.UserPreferenceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPreferenceServiceImpl implements UserPreferenceService {
    private final UserPreferenceRepository userPreferenceRepository;

    @Autowired
    public UserPreferenceServiceImpl(UserPreferenceRepository userPreferenceRepository) {
        this.userPreferenceRepository = userPreferenceRepository;
    }

    @Override
    public UserPreference saveUserPreference(UserPreference userPreference) {
        return userPreferenceRepository.save(userPreference);
    }

    @Override
    public UserPreference updateUserPreference(UserPreference userPreference) {
        return userPreferenceRepository.save(userPreference);
    }

    @Override
    public void deleteUserPreference(Long id) {
        userPreferenceRepository.deleteById(id);
    }

    @Override
    public UserPreference getUserPreferenceById(Long id) {
        return userPreferenceRepository.findById(id).orElse(null);
    }

    @Override
    public List<UserPreference> getAllUserPreferences() {
        return userPreferenceRepository.findAll();
    }
}