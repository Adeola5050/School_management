package com.schoolmagement.school_management.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class UpdateStudentDto {

    @NonNull
    private String studentId;
    private String studentFirstName;
    private String studentLastName;
    private String phoneNumber;
}
