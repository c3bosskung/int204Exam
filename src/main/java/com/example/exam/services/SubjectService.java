package com.example.exam.services;

import com.example.exam.entities.Subject;
import com.example.exam.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> findAllSubject() {
        return subjectRepository.findAll();
    }
}
