package com.schoolmagement.school_management.model.student;

import com.schoolmagement.school_management.model.baseUser.BaseUser;
import com.schoolmagement.school_management.model.subject.Subject;
import com.schoolmagement.school_management.profile.Profile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseUser {

    private String createdDate;
    private String modifiedDate;
    private boolean isActive;

    @DBRef
    private Profile user;
    List<Subject> subjects;
}
