package com.modafa.v1.serviceImp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modafa.v1.entity.Evaluation;
import com.modafa.v1.repository.EvaluationRepository;
import com.modafa.v1.services.EvaluationService;

import java.util.List;

@Service
public class EvaluationServiceImpl implements EvaluationService {
    private final EvaluationRepository evaluationRepository;

    @Autowired
    public EvaluationServiceImpl(EvaluationRepository evaluationRepository) {
        this.evaluationRepository = evaluationRepository;
    }

    @Override
    public Evaluation saveEvaluation(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    @Override
    public Evaluation updateEvaluation(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    @Override
    public void deleteEvaluation(Long evaluationId) {
        evaluationRepository.deleteById(evaluationId);
    }

    @Override
    public Evaluation getEvaluationById(Long evaluationId) {
        return evaluationRepository.findById(evaluationId).orElse(null);
    }

    @Override
    public List<Evaluation> getAllEvaluations() {
        return evaluationRepository.findAll();
    }
}