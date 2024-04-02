package com.modafa.v1.services;


import java.util.List;

import com.modafa.v1.entity.Skill;

public interface SkillService {
    Skill saveSkill(Skill skill);
    List<Skill> saveMultipleSkills(List<Skill> skills);
    Skill updateSkill(Skill skill);
    void deleteSkill(Integer skillId);
    Skill getSkillById(Integer skillId);
    List<Skill> getAllSkills();
}