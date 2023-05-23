package com.example.exam.controllers;

import com.example.exam.dtos.SubjectNameDTO;
import com.example.exam.services.SubjectService;
import com.example.exam.utils.ListMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/64130500099/subjects")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ListMapper listMapper;

    @GetMapping
    public List<SubjectNameDTO> getAllSubjectName() {
        return listMapper.mapList(subjectService.findAllSubject(), SubjectNameDTO.class, modelMapper);
    }
}
