package com.schoolmagement.school_management.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UpdateTeacherDto {
    private String teacherId;
    private String teacherFirstName;
    private String teacherLastName;
    private String phoneNumber;

}
