package com.modafa.oppotunitie.service;

import com.example.demo.entity.Application;
import java.util.List;

public interface ApplicationService {
    Application saveApplication(Application application);
    Application updateApplication(Application application);
    void deleteApplication(Long applicationId);
    Application getApplicationById(Long applicationId);
    List<Application> getAllApplications();
}