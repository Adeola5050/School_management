package com.schoolmagement.school_management.model.student;

import com.schoolmagement.school_management.model.baseUser.BaseUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student extends BaseUser {

    private String createdDate;
    private String modifiedDate;
    private boolean isActive;
}
