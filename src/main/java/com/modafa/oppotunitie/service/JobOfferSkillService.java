package com.modafa.oppotunitie.service;

import com.example.demo.entity.JobOfferSkill;
import java.util.List;

public interface JobOfferSkillService {
    JobOfferSkill saveJobOfferSkill(JobOfferSkill jobOfferSkill);
    JobOfferSkill updateJobOfferSkill(JobOfferSkill jobOfferSkill);
    void deleteJobOfferSkill(Integer id);
    JobOfferSkill getJobOfferSkillById(Integer id);
    List<JobOfferSkill> getAllJobOfferSkills();
}