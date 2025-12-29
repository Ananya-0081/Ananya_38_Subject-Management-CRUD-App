package com.example.subject.controller;

import com.example.subject.model.Subject;
import com.example.subject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;


    @PostMapping
    public String addSubject(@RequestBody Subject subject) {
        return subjectService.addSubject(subject);
    }
    @GetMapping
    public List<Subject> getSubjects() {
        return subjectService.getAllSubjects();
    }
    @PutMapping("/{id}")
    public String updateSubject(@PathVariable int id,
                                @RequestBody Subject subject) {
        return subjectService.updateSubject(id, subject);
    }
    @DeleteMapping("/{id}")
    public String deleteSubject(@PathVariable int id) {
        return subjectService.deleteSubject(id);
    }
}
