package com.schoolmagement.school_management.service.student;

import com.schoolmagement.school_management.dto.CreateStudentDto;
import com.schoolmagement.school_management.dto.UpdateStudentDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import com.schoolmagement.school_management.model.activity.ActivityLog;
import com.schoolmagement.school_management.model.student.Student;
import com.schoolmagement.school_management.repository.activity.ActivityLogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService{
    @Autowired
    ActivityLogRepository activityLogRepository;
    @Override
    public void createStudentObject(CreateStudentDto dto) throws SchoolManagementException {
        Student student= new Student();
        ActivityLog log= new ActivityLog();


    }

    @Override
    public void updateStudent(UpdateStudentDto dto) throws SchoolManagementException {

    }
}
