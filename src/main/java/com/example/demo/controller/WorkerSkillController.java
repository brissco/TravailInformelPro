package com.example.demo.controller;

import com.example.demo.entity.WorkerSkill;
import com.modafa.oppotunitie.service.WorkerSkillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workerSkills")
public class WorkerSkillController {
    private final WorkerSkillService workerSkillService;

    @Autowired
    public WorkerSkillController(WorkerSkillService workerSkillService) {
        this.workerSkillService = workerSkillService;
    }

    @PostMapping("/")
    public WorkerSkill saveWorkerSkill(@RequestBody WorkerSkill workerSkill) {
        return workerSkillService.saveWorkerSkill(workerSkill);
    }

    @GetMapping("/{id}")
    public WorkerSkill getWorkerSkillById(@PathVariable Long id) {
        return workerSkillService.getWorkerSkillById(id);
    }

    @GetMapping("/")
    public List<WorkerSkill> getAllWorkerSkills() {
        return workerSkillService.getAllWorkerSkills();
    }

    @DeleteMapping("/{id}")
    public String deleteWorkerSkill(@PathVariable Long id) {
        workerSkillService.deleteWorkerSkill(id);
        return "WorkerSkill removed with ID: " + id;
    }

    @PutMapping("/")
    public WorkerSkill updateWorkerSkill(@RequestBody WorkerSkill workerSkill) {
        return workerSkillService.updateWorkerSkill(workerSkill);
    }
}