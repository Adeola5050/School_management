package com.schoolmagement.school_management.model.teacher;
import com.schoolmagement.school_management.model.baseUser.BaseUser;
import com.schoolmagement.school_management.model.subject.Subject;
import com.schoolmagement.school_management.profile.Profile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends BaseUser {

    private String createdDate;
    private String modifiedDate;
    private boolean isActive;
    List<Subject> subjects;

    @DBRef
    private Profile user;
}
