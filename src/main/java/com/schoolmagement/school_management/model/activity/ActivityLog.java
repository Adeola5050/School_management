package com.schoolmagement.school_management.model.activity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ActivityLog {

    @Id
    private String id;
    private ActionType actionType;
    private String modifiedDate;
    private String createdDate;
}
