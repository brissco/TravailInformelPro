package com.modafa.v1.serviceImp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modafa.v1.entity.UserPreference;
import com.modafa.v1.repository.UserPreferenceRepository;
import com.modafa.v1.services.UserPreferenceService;

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