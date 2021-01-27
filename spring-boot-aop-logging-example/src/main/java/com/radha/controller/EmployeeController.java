package com.radha.controller;

import com.radha.model.Employee;
import com.radha.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add/emp")
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/delete/emp")
    public void deleteEmployee(@RequestParam String empId) throws Exception {
        employeeService.deleteEmployee(empId);
    }
}
