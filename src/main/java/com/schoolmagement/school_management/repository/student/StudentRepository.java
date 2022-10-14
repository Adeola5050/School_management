package com.schoolmagement.school_management.repository.student;

import com.schoolmagement.school_management.model.student.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {


    boolean existsByPhoneNumber(String phoneNumber);
}

