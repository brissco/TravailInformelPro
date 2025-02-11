package com.modafa.v1.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.modafa.v1.entity.Skill;
import com.modafa.v1.services.SkillService;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {
    private final SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @PostMapping("/")
    public Skill saveSkill(@RequestBody Skill skill) {
        return skillService.saveSkill(skill);
    }

    @GetMapping("/{skillId}")
    public Skill getSkillById(@PathVariable Integer skillId) {
        return skillService.getSkillById(skillId);
    }

    @GetMapping("/")
    public List<Skill> getAllSkills() {
        return skillService.getAllSkills();
    }

    @DeleteMapping("/{skillId}")
    public String deleteSkill(@PathVariable Integer skillId) {
        skillService.deleteSkill(skillId);
        return "Skill removed with ID: " + skillId;
    }

    
    @PostMapping("/multiple")
    public List<Skill> addMultipleSkills(@RequestBody List<Skill> skills) {
        return skillService.saveMultipleSkills(skills);
    }
    
    @PutMapping("/")
    public Skill updateSkill(@RequestBody Skill skill) {
        return skillService.updateSkill(skill);
    }
}