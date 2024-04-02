package com.modafa.v1.services;



import java.util.List;

import com.modafa.v1.entity.JobOffer;

public interface JobOfferService {
    JobOffer saveJobOffer(JobOffer jobOffer);
    JobOffer updateJobOffer(JobOffer jobOffer);
    void deleteJobOffer(Long offerId);
    JobOffer getJobOfferById(Long offerId);
    List<JobOffer> getAllJobOffers();
}