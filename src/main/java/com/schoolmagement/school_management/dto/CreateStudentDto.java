package com.schoolmagement.school_management.dto;


import com.schoolmagement.school_management.model.subject.Subject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class CreateStudentDto {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String studentClass;
    List<Subject> subjects;
    private String dob;
    private String email;


}
