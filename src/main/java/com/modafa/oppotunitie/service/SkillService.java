package com.modafa.oppotunitie.service;

import com.example.demo.entity.Skill;
import java.util.List;

public interface SkillService {
    Skill saveSkill(Skill skill);
    Skill updateSkill(Skill skill);
    void deleteSkill(Integer skillId);
    Skill getSkillById(Integer skillId);
    List<Skill> getAllSkills();
}