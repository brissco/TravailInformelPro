package com.modafa.oppotunitie.serviceImpl;

import com.example.demo.entity.JobOfferSkill;
import com.modafa.oppotunitie.repository.JobOfferSkillRepository;
import com.modafa.oppotunitie.service.JobOfferSkillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobOfferSkillServiceImpl implements JobOfferSkillService {
    private final JobOfferSkillRepository jobOfferSkillRepository;

    @Autowired
    public JobOfferSkillServiceImpl(JobOfferSkillRepository jobOfferSkillRepository) {
        this.jobOfferSkillRepository = jobOfferSkillRepository;
    }

    @Override
    public JobOfferSkill saveJobOfferSkill(JobOfferSkill jobOfferSkill) {
        return jobOfferSkillRepository.save(jobOfferSkill);
    }

    @Override
    public JobOfferSkill updateJobOfferSkill(JobOfferSkill jobOfferSkill) {
        return jobOfferSkillRepository.save(jobOfferSkill);
    }

    @Override
    public void deleteJobOfferSkill(Integer id) {
        jobOfferSkillRepository.deleteById(id);
    }

    @Override
    public JobOfferSkill getJobOfferSkillById(Integer id) {
        return jobOfferSkillRepository.findById(id).orElse(null);
    }

    @Override
    public List<JobOfferSkill> getAllJobOfferSkills() {
        return jobOfferSkillRepository.findAll();
    }
}