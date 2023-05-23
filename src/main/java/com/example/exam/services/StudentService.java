package com.example.exam.services;

import com.example.exam.entities.StudentGrade;
import com.example.exam.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<StudentGrade> getAllGradeFromStudentId(Integer studentId){
        return studentRepository.findById(studentId).orElseThrow().getGrades();
    }
}
