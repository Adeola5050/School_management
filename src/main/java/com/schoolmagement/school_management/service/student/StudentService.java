package com.schoolmagement.school_management.service.student;

import com.schoolmagement.school_management.dto.CreateStudentDto;
import com.schoolmagement.school_management.dto.UpdateStudentDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import com.schoolmagement.school_management.model.student.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
     void createStudentObject(CreateStudentDto dto) throws SchoolManagementException;

    void updateStudent(UpdateStudentDto dto) throws SchoolManagementException;

    List<Student> findAll();


    Student findStudent_byId(String id) throws SchoolManagementException;
}
