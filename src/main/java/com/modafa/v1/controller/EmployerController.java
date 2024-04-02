package com.modafa.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modafa.v1.entity.Employer;
import com.modafa.v1.services.EmployerService;



@RestController
@RequestMapping("/employers")
public class EmployerController {
    private final EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @PostMapping("/")
    public Employer saveEmployer(@RequestBody Employer employer) {
        return employerService.saveEmployer(employer);
    }

    @GetMapping("/{userId}")
    public Employer getEmployerById(@PathVariable Integer userId) {
        return employerService.getEmployerById(userId);
    }

    @GetMapping("/")
    public List<Employer> getAllEmployers() {
        return employerService.getAllEmployers();
    }

    @DeleteMapping("/{userId}")
    public String deleteEmployer(@PathVariable Integer userId) {
        employerService.deleteEmployer(userId);
        return "Employer removed with ID: " + userId;
    }

    @PutMapping("/")
    public Employer updateEmployer(@RequestBody Employer employer) {
        return employerService.updateEmployer(employer);
    }
}