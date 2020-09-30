package com.example.multicontainerapp.service;

import com.example.multicontainerapp.models.Employee;
import com.example.multicontainerapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void createEmployees(Employee employee) {
        employeeRepository.save(employee);
    }
}
