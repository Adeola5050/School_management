package com.schoolmagement.school_management.controller.student;


import com.schoolmagement.school_management.dto.CreateStudentDto;
import com.schoolmagement.school_management.dto.UpdateStudentDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import com.schoolmagement.school_management.response.ResponseDetails;
import com.schoolmagement.school_management.service.student.StudentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    StudentServiceImpl studentServiceImpl;

    @PostMapping("/create student")
   public ResponseEntity<?> register(@RequestBody CreateStudentDto dto) throws SchoolManagementException{
        studentServiceImpl.createStudentObject(dto);

        ResponseDetails responseDetails= new ResponseDetails(LocalDateTime.now(), "Student created Successfully", "success");
        return new ResponseEntity<>(responseDetails, HttpStatus.CREATED);
    }


    @PostMapping("/update student")
    public ResponseEntity<?> updateStudent(@RequestBody UpdateStudentDto dto) throws SchoolManagementException{
        studentServiceImpl.updateStudent(dto);

        ResponseDetails responseDetails= new ResponseDetails(LocalDateTime.now(),"Student updated successfully", "success");
        return new ResponseEntity<>(responseDetails,HttpStatus.OK);
    }
}
