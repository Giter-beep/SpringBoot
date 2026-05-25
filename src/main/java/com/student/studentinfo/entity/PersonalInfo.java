package com.student.studentinfo.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PersonalInfo {

    private String firstName;
    private String lastName;
    private String nationalId;
    private String birthDate;
    private String gender;
    private String photoUrl;
}