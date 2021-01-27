package com.radha.service;

import com.radha.model.Department;
import com.radha.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    public Department saveDepartment(Department department){
        Department dept = new Department();
        dept.setDeptId(department.getDeptId());
        dept.setDeptName(department.getDeptName());

        return dept;
    }

    public void deleteDepartment(String deptId){

    }
}
