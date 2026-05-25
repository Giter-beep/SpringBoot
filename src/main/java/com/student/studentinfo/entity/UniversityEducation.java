package com.student.studentinfo.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UniversityEducation {

    private String university;
    private String faculty;
    private String speciality;
    private int level;
}