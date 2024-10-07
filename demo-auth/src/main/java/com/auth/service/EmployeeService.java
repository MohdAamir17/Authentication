package com.auth.service;



import com.auth.model.Employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private List<Employee> empList = new ArrayList<>();

    public EmployeeService() {
        empList.add(new Employee(UUID.randomUUID().toString(), "hrishab", "hrishab@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(), "ritesh", "ritesh@gmail.com"));
    }

    public List<Employee> getEmployeesList() {
        return empList;
    }
}