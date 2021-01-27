package com.radha.controller;

import com.radha.model.Department;
import com.radha.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/add/dept")
    public Department createDept(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @DeleteMapping("/delete/dept")
    public void deleteDept(@RequestParam String deptId){
        departmentService.deleteDepartment(deptId);
    }
}
