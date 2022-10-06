package com.schoolmagement.school_management.repository.activity;

import com.schoolmagement.school_management.model.activity.ActivityLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityLogRepository extends MongoRepository<ActivityLog, String> {
}
