package com.modafa.oppotunitie.service;


import com.example.demo.entity.Evaluation;
import java.util.List;

public interface EvaluationService {
    Evaluation saveEvaluation(Evaluation evaluation);
    Evaluation updateEvaluation(Evaluation evaluation);
    void deleteEvaluation(Long evaluationId);
    Evaluation getEvaluationById(Long evaluationId);
    List<Evaluation> getAllEvaluations();
}