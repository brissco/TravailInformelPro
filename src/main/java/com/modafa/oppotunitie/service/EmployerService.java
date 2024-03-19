package com.modafa.oppotunitie.service;

import java.util.List;

import com.example.demo.entity.Employer;

public interface EmployerService {
    Employer saveEmployer(Employer employer);
    Employer updateEmployer(Employer employer);
    void deleteEmployer(Integer userId);
    Employer getEmployerById(Integer userId);
    List<Employer> getAllEmployers();
}