package com.example.demo.controller;


import com.example.demo.entity.Application;
import com.modafa.oppotunitie.service.ApplicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {
    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping("/")
    public Application saveApplication(@RequestBody Application application) {
        return applicationService.saveApplication(application);
    }

    @GetMapping("/{applicationId}")
    public Application getApplicationById(@PathVariable Long applicationId) {
        return applicationService.getApplicationById(applicationId);
    }

    @GetMapping("/")
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }

    @DeleteMapping("/{applicationId}")
    public String deleteApplication(@PathVariable Long applicationId) {
        applicationService.deleteApplication(applicationId);
        return "Application removed with ID: " + applicationId;
    }

    @PutMapping("/")
    public Application updateApplication(@RequestBody Application application) {
        return applicationService.updateApplication(application);
    }
}