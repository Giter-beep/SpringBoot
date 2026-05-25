package com.student.studentinfo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ScholarshipInfo {

    private boolean scholarship;

    private String scholarshipType;

    private String country;
}