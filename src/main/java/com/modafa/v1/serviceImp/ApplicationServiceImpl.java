package com.modafa.v1.serviceImp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modafa.v1.entity.Application;
import com.modafa.v1.repository.ApplicationRepository;
import com.modafa.v1.services.ApplicationService;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @Override
    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }

    @Override
    public Application updateApplication(Application application) {
        return applicationRepository.save(application);
    }

    @Override
    public void deleteApplication(Long applicationId) {
        applicationRepository.deleteById(applicationId);
    }

    @Override
    public Application getApplicationById(Long applicationId) {
        return applicationRepository.findById(applicationId).orElse(null);
    }

    @Override
    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }
}