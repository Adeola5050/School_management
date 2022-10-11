package com.schoolmagement.school_management.service.student;

import com.schoolmagement.school_management.dto.CreateStudentDto;
import com.schoolmagement.school_management.dto.UpdateStudentDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
     void createStudentObject(CreateStudentDto dto) throws SchoolManagementException;

    void updateStudent(UpdateStudentDto dto) throws SchoolManagementException;
}
