package com.modafa.oppotunitie.service;

import com.example.demo.entity.WorkerSkill;
import java.util.List;

public interface WorkerSkillService {
    WorkerSkill saveWorkerSkill(WorkerSkill workerSkill);
    WorkerSkill updateWorkerSkill(WorkerSkill workerSkill);
    void deleteWorkerSkill(Long id);
    WorkerSkill getWorkerSkillById(Long id);
    List<WorkerSkill> getAllWorkerSkills();
}