package com.example.subject.service;

import com.example.subject.model.Subject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    private List<Subject> subjectList = new ArrayList<>();

    public String addSubject(Subject subject) {
        subjectList.add(subject);
        return "Subject Added Successfully";
    }

    public List<Subject> getAllSubjects() {
        return subjectList;
    }

    public String updateSubject(int id, Subject subject) {
        for (Subject s : subjectList) {
            if (s.getId() == id) {
                s.setSubjectCode(subject.getSubjectCode());
                s.setSubjectName(subject.getSubjectName());
                return "Subject Updated Successfully";
            }
        }
        return "Subject Not Found";
    }

    public String deleteSubject(int id) {
        subjectList.removeIf(s -> s.getId() == id);
        return "Subject Deleted Successfully";
    }
}
