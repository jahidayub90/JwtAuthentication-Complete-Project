package com.codemyth.controller;

import com.codemyth.model.Employee;
import com.codemyth.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/welcome")
@AllArgsConstructor
@Slf4j
public class HomeController {

    //private static final Logger log = LogManager.getLogger(HomeController.class);

    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployeesList() {
        //Logger log = null;
        //log.info("Get employees list");
        log.info("Get employees list");
        return employeeService.getEmployeesList();
    }
}
