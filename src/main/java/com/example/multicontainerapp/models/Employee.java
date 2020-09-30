package com.example.multicontainerapp.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Employee {

    private int employeeId;
    private String employeeName;
    private String companyName;
    private String employeeContactNumber;
    private String employeeEmailAddress;
}
