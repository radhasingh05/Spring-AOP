package com.radha;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee createEmployee(String name, String empId) {

        Employee emp = new Employee();
        emp.setName(name);
        emp.setEmpId(empId);
        return emp;
    }


}
