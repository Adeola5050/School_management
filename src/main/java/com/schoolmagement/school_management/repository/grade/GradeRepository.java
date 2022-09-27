package com.schoolmagement.school_management.repository.grade;

import com.schoolmagement.school_management.grade.Grade;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeRepository extends MongoRepository<Grade, String> {
}
