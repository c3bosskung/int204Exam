package com.example.exam.controllers;

import com.example.exam.dtos.StudentAllGradeDTO;
import com.example.exam.entities.StudentGrade;
import com.example.exam.services.StudentService;
import com.example.exam.utils.ListMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/64130500099/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ListMapper listMapper;
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping("/{studentId}")
    public List<StudentAllGradeDTO> getAllGradeFromStudentId(@PathVariable Integer studentId){
        return listMapper.mapList(studentService.getAllGradeFromStudentId(studentId), StudentAllGradeDTO.class, modelMapper);
    }
}
