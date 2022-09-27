package com.schoolmagement.school_management.profile;

import com.schoolmagement.school_management.model.baseUser.USERTYPE;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@Document
@NoArgsConstructor
@AllArgsConstructor

public class Profile {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private LocalDateTime modifiedDate;
    private LocalDateTime createdDate;
    private USERTYPE usertype;


}
