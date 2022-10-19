package com.schoolmagement.school_management.service.teacher;


import com.schoolmagement.school_management.dto.CreateTeacherDto;
import com.schoolmagement.school_management.dto.UpdateTeacherDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import com.schoolmagement.school_management.model.teacher.Teacher;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {

    void createTeacherObject(CreateTeacherDto dto) throws SchoolManagementException;

    void updateTeacher(UpdateTeacherDto dto) throws SchoolManagementException;

    Teacher findTeacher_byId(String id) throws SchoolManagementException;
}
