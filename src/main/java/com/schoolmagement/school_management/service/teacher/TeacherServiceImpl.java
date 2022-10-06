package com.schoolmagement.school_management.service.teacher;


import com.schoolmagement.school_management.data.dto.CreateTeacherDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import com.schoolmagement.school_management.model.baseUser.USERTYPE;
import com.schoolmagement.school_management.profile.Profile;
import com.schoolmagement.school_management.repository.profile.ProfileRepository;
import com.schoolmagement.school_management.repository.teacher.TeacherRepository;
import com.schoolmagement.school_management.service.student.profile.ProfileServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    ProfileServiceImpl profileServiceImpl;

    @Autowired
    ProfileRepository profileRepository;
    @Override
    public void createTeacherObject(CreateTeacherDto dto) throws SchoolManagementException {
        if(teacherRepository.existsByPhoneNumber(dto.getPhoneNumber())) {
            throw new SchoolManagementException("Teacher with the phone Number exists already");
        }

            Profile profile= Profile.builder()
                    .firstName(dto.getFirstName())
                    .lastName(dto.getLastName())
                    .phoneNumber(dto.getPhoneNumber())
                    .modifiedDate(LocalDateTime.now())
                    .createdDate(LocalDateTime.now())
                    .usertype(USERTYPE.TEACHER)
                    .build();

        }


    }

