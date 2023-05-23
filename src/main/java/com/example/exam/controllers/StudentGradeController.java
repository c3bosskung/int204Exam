package com.example.exam.controllers;

import com.example.exam.dtos.CreateAndUpdateStudentGradeDTO;
import com.example.exam.entities.StudentGrade;
import com.example.exam.services.StudentGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/64130500099/studentGrades")
public class StudentGradeController {
    @Autowired
    private StudentGradeService studentGradeService;

    @PostMapping("/{studentId}")
    private StudentGrade addNewStudentGrade(@PathVariable Integer studentId, @RequestBody CreateAndUpdateStudentGradeDTO newStudentGrade) {
        return studentGradeService.addNewStudentGrade(studentId, newStudentGrade);
    }

    @DeleteMapping("/{studentId}/{subjectId}")
    private void deleteStudentAllGradeBySubject(@PathVariable Integer studentId, @PathVariable Integer subjectId) {
        studentGradeService.deleteStudentAllGradeBySubject(studentId, subjectId);
    }
}
