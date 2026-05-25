package com.student.studentinfo.dto;

import com.student.studentinfo.entity.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class StudentRequestDTO {

    private PersonalInfo personalInfo;

    private FundamentalEducation fundamentalEducation;

    private SecondaryEducation secondaryEducation;

    private UniversityEducation universityEducation;

    private ContactInfo contactInfo;

    private ScholarshipInfo scholarshipInfo;
}