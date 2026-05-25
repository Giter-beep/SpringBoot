package com.student.studentinfo.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FundamentalEducation {

    private String schoolName;
    private String city;
    private int graduationYear;
    private double average;
}