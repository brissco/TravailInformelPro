package com.modafa.v1.services;


import java.util.List;

import com.modafa.v1.entity.JobOfferSkill;

public interface JobOfferSkillService {
    JobOfferSkill saveJobOfferSkill(JobOfferSkill jobOfferSkill);
    JobOfferSkill updateJobOfferSkill(JobOfferSkill jobOfferSkill);
    void deleteJobOfferSkill(Integer id);
    JobOfferSkill getJobOfferSkillById(Integer id);
    List<JobOfferSkill> getAllJobOfferSkills();
}