package com.schoolmagement.school_management.repository.teacher;

import com.schoolmagement.school_management.model.teacher.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher,String> {
}
