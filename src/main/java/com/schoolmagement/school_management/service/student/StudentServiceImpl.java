package com.schoolmagement.school_management.service.student;

import com.schoolmagement.school_management.dto.CreateStudentDto;
import com.schoolmagement.school_management.dto.UpdateStudentDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import com.schoolmagement.school_management.model.activity.ActivityLog;
import com.schoolmagement.school_management.model.baseUser.USERTYPE;
import com.schoolmagement.school_management.model.student.Student;
import com.schoolmagement.school_management.model.subject.Subject;
import com.schoolmagement.school_management.profile.Profile;
import com.schoolmagement.school_management.repository.activity.ActivityLogRepository;
import com.schoolmagement.school_management.repository.student.StudentRepository;
import com.schoolmagement.school_management.service.student.profile.ProfileServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService{
    @Autowired
    ActivityLogRepository activityLogRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    ProfileServiceImpl profileService;


    @Override
    public void createStudentObject(CreateStudentDto dto) throws SchoolManagementException {
        ActivityLog log= new ActivityLog();
        if(studentRepository.existsByPhoneNumber(dto.getPhoneNumber())){
            throw new SchoolManagementException("Student with the phone Number exists already");
        }
        Profile profile= Profile.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .phoneNumber(dto.getPhoneNumber())
                .usertype(USERTYPE.STUDENT)
                .createdDate(LocalDateTime.now())
                .modifiedDate(LocalDateTime.now())
                .build();

        profileService.createProfile(profile);
        Student student= Student.builder()
                .isActive(true)
                .createdDate(LocalDateTime.now().toString())
                .modifiedDate(LocalDateTime.now().toString())
                .subjects(List.of())
                .build();
        studentRepository.save(student);




    }

    @Override
    public void updateStudent(UpdateStudentDto dto) throws SchoolManagementException {

    }
}
