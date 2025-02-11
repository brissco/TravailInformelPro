package com.modafa.v1.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.modafa.v1.entity.JobOfferSkill;
import com.modafa.v1.services.JobOfferSkillService;

import java.util.List;

@RestController
@RequestMapping("/jobOfferSkills")
public class JobOfferSkillController {
    private final JobOfferSkillService jobOfferSkillService;

    @Autowired
    public JobOfferSkillController(JobOfferSkillService jobOfferSkillService) {
        this.jobOfferSkillService = jobOfferSkillService;
    }

    @PostMapping("/")
    public JobOfferSkill saveJobOfferSkill(@RequestBody JobOfferSkill jobOfferSkill) {
        return jobOfferSkillService.saveJobOfferSkill(jobOfferSkill);
    }

    @GetMapping("/{id}")
    public JobOfferSkill getJobOfferSkillById(@PathVariable Integer id) {
        return jobOfferSkillService.getJobOfferSkillById(id);
    }

    @GetMapping("/")
    public List<JobOfferSkill> getAllJobOfferSkills() {
        return jobOfferSkillService.getAllJobOfferSkills();
    }

    @DeleteMapping("/{id}")
    public String deleteJobOfferSkill(@PathVariable Integer id) {
        jobOfferSkillService.deleteJobOfferSkill(id);
        return "JobOfferSkill removed with ID: " + id;
    }

    @PutMapping("/")
    public JobOfferSkill updateJobOfferSkill(@RequestBody JobOfferSkill jobOfferSkill) {
        return jobOfferSkillService.updateJobOfferSkill(jobOfferSkill);
    }
}