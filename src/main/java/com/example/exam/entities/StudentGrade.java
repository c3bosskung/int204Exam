package com.example.exam.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StudentGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gradeId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "subjectId")
    private Subject subject;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    private Double grade;
}
