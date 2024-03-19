package com.modafa.oppotunitie.service;


import com.example.demo.entity.JobOffer;
import java.util.List;

public interface JobOfferService {
    JobOffer saveJobOffer(JobOffer jobOffer);
    JobOffer updateJobOffer(JobOffer jobOffer);
    void deleteJobOffer(Long offerId);
    JobOffer getJobOfferById(Long offerId);
    List<JobOffer> getAllJobOffers();
}