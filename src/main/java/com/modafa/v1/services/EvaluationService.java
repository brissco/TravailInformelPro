package com.modafa.v1.services;


import java.util.List;

import com.modafa.v1.entity.Evaluation;

public interface EvaluationService {
    Evaluation saveEvaluation(Evaluation evaluation);
    Evaluation updateEvaluation(Evaluation evaluation);
    void deleteEvaluation(Long evaluationId);
    Evaluation getEvaluationById(Long evaluationId);
    List<Evaluation> getAllEvaluations();
}