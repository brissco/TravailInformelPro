package com.modafa.v1.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.modafa.v1.entity.Evaluation;
import com.modafa.v1.services.EvaluationService;

import java.util.List;

@RestController
@RequestMapping("/evaluations")
public class EvaluationController {
    private final EvaluationService evaluationService;

    @Autowired
    public EvaluationController(EvaluationService evaluationService) {
        this.evaluationService = evaluationService;
    }

    @PostMapping("/")
    public Evaluation saveEvaluation(@RequestBody Evaluation evaluation) {
        return evaluationService.saveEvaluation(evaluation);
    }

    @GetMapping("/{evaluationId}")
    public Evaluation getEvaluationById(@PathVariable Long evaluationId) {
        return evaluationService.getEvaluationById(evaluationId);
    }

    @GetMapping("/")
    public List<Evaluation> getAllEvaluations() {
        return evaluationService.getAllEvaluations();
    }

    @DeleteMapping("/{evaluationId}")
    public String deleteEvaluation(@PathVariable Long evaluationId) {
        evaluationService.deleteEvaluation(evaluationId);
        return "Evaluation removed with ID: " + evaluationId;
    }

    @PutMapping("/")
    public Evaluation updateEvaluation(@RequestBody Evaluation evaluation) {
        return evaluationService.updateEvaluation(evaluation);
    }
}