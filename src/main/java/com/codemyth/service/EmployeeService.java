package com.codemyth.service;

import com.codemyth.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {


    private List<Employee> empList = new ArrayList<>();

    public EmployeeService() {
        empList.add(new Employee(UUID.randomUUID().toString(), "Zahid", "zahid@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(), "Ravi", "ravi@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(),"Arman", "arman90@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(),"Rahim", "rahim86@gmail.com"));
    }

    public List<Employee> getEmployeesList() {
        return empList;
    }
}
