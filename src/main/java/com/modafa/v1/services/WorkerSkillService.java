package com.modafa.v1.services;


import java.util.List;

import com.modafa.v1.entity.WorkerSkill;

public interface WorkerSkillService {
    WorkerSkill saveWorkerSkill(WorkerSkill workerSkill);
    WorkerSkill updateWorkerSkill(WorkerSkill workerSkill);
    void deleteWorkerSkill(Long id);
    WorkerSkill getWorkerSkillById(Long id);
    List<WorkerSkill> getAllWorkerSkills();
}