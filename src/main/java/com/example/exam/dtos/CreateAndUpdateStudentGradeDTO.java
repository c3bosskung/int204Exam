package com.example.exam.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateAndUpdateStudentGradeDTO {
    private Integer gradeId;
    private Integer subjectSubjectId;
    private Double grade;
}
