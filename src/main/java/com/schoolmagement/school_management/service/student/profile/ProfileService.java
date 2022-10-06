package com.schoolmagement.school_management.service.student.profile;

import com.schoolmagement.school_management.data.dto.UpdateProfileDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import com.schoolmagement.school_management.profile.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfileService {
    Profile findProfileById(String id) throws SchoolManagementException;

    List<Profile> findAllProfiles();

    void deleteProfileById(String id) throws SchoolManagementException;

    void createProfile(Profile profile) throws SchoolManagementException;

    void updateProfile(UpdateProfileDto dto) throws SchoolManagementException;

    void updateProfile(UpdateProfileDto dto) throws SchoolManagementException;
}
