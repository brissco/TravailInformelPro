package com.modafa.v1.services;


import java.util.List;

import com.modafa.v1.entity.Application;

public interface ApplicationService {
    Application saveApplication(Application application);
    Application updateApplication(Application application);
    void deleteApplication(Long applicationId);
    Application getApplicationById(Long applicationId);
    List<Application> getAllApplications();
}