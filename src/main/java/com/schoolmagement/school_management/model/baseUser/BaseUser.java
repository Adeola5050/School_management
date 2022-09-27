package com.schoolmagement.school_management.model.baseUser;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class BaseUser {

    private  String id;
    private String firstName;
    private String lastName;
    private String age;
    private String phoneNumber;
    private String email;
}
