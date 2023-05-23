package com.example.exam.repositories;

import com.example.exam.entities.Student;
import com.example.exam.entities.StudentGrade;
import com.example.exam.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentGradeRepository extends JpaRepository<StudentGrade, Integer> {
    StudentGrade findByStudentAndSubject(Student student, Subject subject);
}
