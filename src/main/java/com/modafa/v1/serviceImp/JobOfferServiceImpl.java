package com.modafa.v1.serviceImp;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modafa.v1.entity.JobOffer;
import com.modafa.v1.repository.JobOfferRepository;
import com.modafa.v1.services.JobOfferService;

import java.util.List;

@Service
public class JobOfferServiceImpl implements JobOfferService {
    private final JobOfferRepository jobOfferRepository;

    @Autowired
    public JobOfferServiceImpl(JobOfferRepository jobOfferRepository) {
        this.jobOfferRepository = jobOfferRepository;
    }

    @Override
    public JobOffer saveJobOffer(JobOffer jobOffer) {
        return jobOfferRepository.save(jobOffer);
    }

    @Override
    public JobOffer updateJobOffer(JobOffer jobOffer) {
        return jobOfferRepository.save(jobOffer);
    }

    @Override
    public void deleteJobOffer(Long offerId) {
        jobOfferRepository.deleteById(offerId);
    }

    @Override
    public JobOffer getJobOfferById(Long offerId) {
        return jobOfferRepository.findById(offerId).orElse(null);
    }

    @Override
    public List<JobOffer> getAllJobOffers() {
        return jobOfferRepository.findAll();
    }
}