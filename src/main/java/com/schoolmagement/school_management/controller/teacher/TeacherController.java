package com.schoolmagement.school_management.controller.teacher;

import com.schoolmagement.school_management.dto.CreateTeacherDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import com.schoolmagement.school_management.response.ResponseDetails;
import com.schoolmagement.school_management.service.teacher.TeacherServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherServiceImpl teacherServiceImpl;

    @PostMapping("/create-teacher")

    public ResponseEntity<?> registerTeacher(@RequestBody CreateTeacherDto dto) throws SchoolManagementException{
        teacherServiceImpl.createTeacherObject(dto);

        ResponseDetails responseDetails= new ResponseDetails(LocalDateTime.now(), "Teacher created successfully", "success");
        return new ResponseEntity<>(responseDetails, HttpStatus.CREATED);
    }
}
