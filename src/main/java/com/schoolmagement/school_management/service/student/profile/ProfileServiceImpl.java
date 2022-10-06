package com.schoolmagement.school_management.service.student.profile;

import com.schoolmagement.school_management.data.dto.UpdateProfileDto;
import com.schoolmagement.school_management.exception.SchoolManagementException;
import com.schoolmagement.school_management.profile.Profile;
import com.schoolmagement.school_management.repository.profile.ProfileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProfileServiceImpl implements ProfileService{

    @Autowired
    ProfileRepository profileRepository;

    public Boolean profileDoesntByPhoneNumber(String phoneNumber){
        return  !profileRepository.existsByPhoneNumber(phoneNumber);
    }
    @Override
    public Profile findProfileById(String id) throws SchoolManagementException {

        if(profileRepository.existsById(id)){
            return profileRepository.findById(id).get();
        }
        else{
            throw new SchoolManagementException("User with that id does not exist");
        }
    }

    @Override
    public List<Profile> findAllProfiles() {
        return profileRepository.findAll();
    }

    @Override
    public void deleteProfileById(String id) throws SchoolManagementException {
        if(profileRepository.existsById(id)){
            profileRepository.deleteById(id);
        }else {
            throw new SchoolManagementException("User that id does not exist");
        }

    }

    @Override
    public void createProfile(Profile profile) throws SchoolManagementException {
        if(profileRepository.existsByPhoneNumber(profile.getPhoneNumber())){
            throw new SchoolManagementException("User with phone Number exist already");
        }
        profileRepository.save(profile);

    }

    @Override
    public void updateProfile(UpdateProfileDto dto) throws SchoolManagementException {

    }

    public  Profile findProfileByPhoneNumber(String phoneNumber) throws SchoolManagementException{
        if(profileRepository.existsByPhoneNumber(phoneNumber)){
            return profileRepository.findByPhoneNumber(phoneNumber);
        }
        else {
            throw  new SchoolManagementException("phone number does not exist");
        }
    }
}
