package com.schoolmagement.school_management.model.student;

import com.schoolmagement.school_management.model.baseUser.BaseUser;
import com.schoolmagement.school_management.model.subject.Subject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseUser {

    private String createdDate;
    private String modifiedDate;
    private boolean isActive;
    List<Subject> subjects;
}
