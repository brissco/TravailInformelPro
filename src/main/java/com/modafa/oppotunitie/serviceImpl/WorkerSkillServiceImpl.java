package com.modafa.oppotunitie.serviceImpl;

import com.example.demo.entity.WorkerSkill;
import com.modafa.oppotunitie.repository.WorkerSkillRepository;
import com.modafa.oppotunitie.service.WorkerSkillService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerSkillServiceImpl implements WorkerSkillService {
    private final WorkerSkillRepository workerSkillRepository;

    @Autowired
    public WorkerSkillServiceImpl(WorkerSkillRepository workerSkillRepository) {
        this.workerSkillRepository = workerSkillRepository;
    }

    @Override
    public WorkerSkill saveWorkerSkill(WorkerSkill workerSkill) {
        return workerSkillRepository.save(workerSkill);
    }

    @Override
    public WorkerSkill updateWorkerSkill(WorkerSkill workerSkill) {
        return workerSkillRepository.save(workerSkill);
    }

    @Override
    public void deleteWorkerSkill(Long id) {
        workerSkillRepository.deleteById(id);
    }

    @Override
    public WorkerSkill getWorkerSkillById(Long id) {
        return workerSkillRepository.findById(id).orElse(null);
    }

    @Override
    public List<WorkerSkill> getAllWorkerSkills() {
        return workerSkillRepository.findAll();
    }
}