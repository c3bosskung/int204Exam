package com.example.exam.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Student {
    @Id
    private Integer studentId;
    private String name;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<StudentGrade> grades;
}
