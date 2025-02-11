package com.modafa.v1.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modafa.v1.entity.Employer;
import com.modafa.v1.repository.EmployerRepository;
import com.modafa.v1.services.EmployerService;

@Service
public class EmployerServiceImpl implements EmployerService {
    private final EmployerRepository employerRepository;

    @Autowired
    public EmployerServiceImpl(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @Override
    public Employer saveEmployer(Employer employer) {
        return employerRepository.save(employer);
    }

    @Override
    public Employer updateEmployer(Employer employer) {
        return employerRepository.save(employer);
    }

    @Override
    public void deleteEmployer(Integer userId) {
        employerRepository.deleteById(userId);
    }

    @Override
    public Employer getEmployerById(Integer userId) {
        return employerRepository.findById(userId).orElse(null);
    }

    @Override
    public List<Employer> getAllEmployers() {
        return employerRepository.findAll();
    }
}