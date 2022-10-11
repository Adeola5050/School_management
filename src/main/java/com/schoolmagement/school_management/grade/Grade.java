package com.schoolmagement.school_management.grade;


import com.schoolmagement.school_management.model.student.Student;
import com.schoolmagement.school_management.model.teacher.Teacher;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Grade {
    private String course;
    private Teacher teacher;
    private Student student;


}
