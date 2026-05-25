package com.student.studentinfo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    @Id
    private String id;

    private PersonalInfo personalInfo;

    private FundamentalEducation fundamentalEducation;

    private SecondaryEducation secondaryEducation;

    private UniversityEducation universityEducation;

    private ContactInfo contactInfo;

    private ScholarshipInfo scholarshipInfo;
}