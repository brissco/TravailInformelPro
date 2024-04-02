package com.modafa.v1.serviceImp;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modafa.v1.entity.Skill;
import com.modafa.v1.repository.SkillRepository;
import com.modafa.v1.services.SkillService;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {
    private final SkillRepository skillRepository;

    @Autowired
    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public Skill updateSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Integer skillId) {
        skillRepository.deleteById(skillId);
    }

    @Override
    public Skill getSkillById(Integer skillId) {
        return skillRepository.findById(skillId).orElse(null);
    }

    @Override
    public List<Skill> saveMultipleSkills(List<Skill> skills) {
        return skillRepository.saveAll(skills);
    }
    
    @Override
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }
}