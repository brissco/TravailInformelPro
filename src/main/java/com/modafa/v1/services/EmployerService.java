package com.modafa.v1.services;

import java.util.List;

import com.modafa.v1.entity.Employer;


public interface EmployerService {
    Employer saveEmployer(Employer employer);
    Employer updateEmployer(Employer employer);
    void deleteEmployer(Integer userId);
    Employer getEmployerById(Integer userId);
    List<Employer> getAllEmployers();
}