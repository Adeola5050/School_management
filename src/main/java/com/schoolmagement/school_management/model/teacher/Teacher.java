package com.schoolmagement.school_management.model.teacher;
import com.schoolmagement.school_management.model.baseUser.BaseUser;
import com.schoolmagement.school_management.profile.Profile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Teacher extends BaseUser {

    private String createdDate;
    private String modifiedDate;
    private boolean isActive;
    private Profile user;
}
