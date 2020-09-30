package com.example.multicontainerapp.controller;

import com.example.multicontainerapp.models.Employee;
import com.example.multicontainerapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(path="/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path="/ping",produces = "application/text")
    public String heathCheck(){

        return "APP is Up and Running";
    }

    @PostMapping(path="/postEmployees", produces = MediaType.APPLICATION_JSON_VALUE)
    public void createEmployee(@RequestBody Employee employee) {

        employeeService.createEmployees(employee);
    }
}
