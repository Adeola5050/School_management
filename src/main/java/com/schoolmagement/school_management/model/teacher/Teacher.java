package com.schoolmagement.school_management.model.teacher;
import com.schoolmagement.school_management.model.baseUser.BaseUser;
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
    @Id
    private String id;

    private String createdDate;
    private String modifiedDate;
    private boolean isActive;
}
