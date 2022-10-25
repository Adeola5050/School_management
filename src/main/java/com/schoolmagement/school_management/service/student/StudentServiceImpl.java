package com.schoolmagement.school_management.service.student;

import com.schoolmagement.school_management.dto.CreateStudentDto;
import com.schoolmagement.school_management.dto.UpdateStudentDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import com.schoolmagement.school_management.model.activity.ActionType;
import com.schoolmagement.school_management.model.activity.ActivityLog;
import com.schoolmagement.school_management.model.baseUser.USERTYPE;
import com.schoolmagement.school_management.model.student.Student;
import com.schoolmagement.school_management.model.subject.Subject;
import com.schoolmagement.school_management.profile.Profile;
import com.schoolmagement.school_management.repository.activity.ActivityLogRepository;
import com.schoolmagement.school_management.repository.profile.ProfileRepository;
import com.schoolmagement.school_management.repository.student.StudentRepository;
import com.schoolmagement.school_management.service.student.profile.ProfileServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
    @Autowired
    ProfileRepository profileRepository;


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
                .createdDate(LocalDateTime.now().toString())
                .modifiedDate(LocalDateTime.now().toString())
                .build();

        profileService.createProfile(profile);
        Student student= Student.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .dob(dto.getDob())
                .phoneNumber(dto.getPhoneNumber())
                .subjects(new ArrayList<>())
                .isActive(true)
                .createdDate(LocalDateTime.now().toString())
                .modifiedDate(LocalDateTime.now().toString())
                .subjects(List.of())
                .build();
        studentRepository.save(student);

        log.setCreatedDate(LocalDateTime.now().toString());
        log.setActionType(ActionType.STUDENT_CREATED);
        activityLogRepository.save(log);



    }

    @Override
    public void updateStudent(UpdateStudentDto dto) throws SchoolManagementException {
        Student student=findStudent_byId(dto.getStudentId());
        Profile profile= student.getUser();
        if(dto.getStudentFirstName()!= null){
            profile.setFirstName(dto.getStudentFirstName());
        }
        if(dto.getStudentLastName()!= null){
            profile.setLastName(dto.getStudentLastName());
        }
        if(dto.getPhoneNumber() != null){
            profile.setPhoneNumber(dto.getPhoneNumber());
        }
        profile.setModifiedDate(LocalDateTime.now().toString());
        profileRepository.save(profile);

        student.setModifiedDate(LocalDateTime.now().toString());
        studentRepository.save(student);


    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudent_byId(String id) throws SchoolManagementException {
        return studentRepository.findById(id).orElseThrow(()->
                new SchoolManagementException("Id doesn't match any student in the database"));
    }
}
