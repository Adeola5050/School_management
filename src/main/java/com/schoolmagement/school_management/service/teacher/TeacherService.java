package com.schoolmagement.school_management.service.teacher;


import com.schoolmagement.school_management.dto.CreateTeacherDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {

    void createTeacherObject(CreateTeacherDto dto) throws SchoolManagementException;
}
