package com.schoolmagement.school_management.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CreateTeacherDto {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String subject;
}
