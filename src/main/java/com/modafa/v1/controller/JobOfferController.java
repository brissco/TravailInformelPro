package com.modafa.v1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.modafa.v1.entity.JobOffer;
import com.modafa.v1.services.JobOfferService;

import java.util.List;

@RestController
@RequestMapping("/jobOffers")
public class JobOfferController {
    private final JobOfferService jobOfferService;

    @Autowired
    public JobOfferController(JobOfferService jobOfferService) {
        this.jobOfferService = jobOfferService;
    }

    @PostMapping("/")
    public JobOffer saveJobOffer(@RequestBody JobOffer jobOffer) {
        return jobOfferService.saveJobOffer(jobOffer);
    }

    @GetMapping("/{offerId}")
    public JobOffer getJobOfferById(@PathVariable Long offerId) {
        return jobOfferService.getJobOfferById(offerId);
    }

    @GetMapping("/")
    public List<JobOffer> getAllJobOffers() {
        return jobOfferService.getAllJobOffers();
    }

    @DeleteMapping("/{offerId}")
    public String deleteJobOffer(@PathVariable Long offerId) {
        jobOfferService.deleteJobOffer(offerId);
        return "JobOffer removed with ID: " + offerId;
    }

    @PutMapping("/")
    public JobOffer updateJobOffer(@RequestBody JobOffer jobOffer) {
        return jobOfferService.updateJobOffer(jobOffer);
    }
}