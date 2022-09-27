package com.schoolmagement.school_management.repository.profile;

import com.schoolmagement.school_management.profile.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String> {
}
