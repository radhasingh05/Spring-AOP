package com.radha.service;

import com.radha.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public Employee saveEmployee(Employee employee){
        Employee emp = new Employee();
        emp.setEmpId(employee.getEmpId());
        emp.setFirstName(employee.getFirstName());
        emp.setLastName(employee.getLastName());
        emp.setAddress(employee.getAddress());

        return emp;
    }

    public void deleteEmployee(String empId) throws Exception{
            throw new Exception("Error");
    }
}
