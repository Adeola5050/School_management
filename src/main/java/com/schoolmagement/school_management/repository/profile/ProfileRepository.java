package com.schoolmagement.school_management.repository.profile;

import com.schoolmagement.school_management.profile.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String> {

    Profile findByPhoneNumber(String phoneNumber);

    Boolean existsByPhoneNumber(String phoneNumber);

    Page<Profile> findAllByFirstNameContaining(String firstName, Pageable pageable);

    Page<Profile> findAllByLastNameContaining(String lastName, Pageable pageable);

    boolean findByFirstName(String firstName);

}
