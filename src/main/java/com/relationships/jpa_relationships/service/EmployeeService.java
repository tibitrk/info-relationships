package com.relationships.jpa_relationships.service;

import com.relationships.jpa_relationships.model.Employee;
import com.relationships.jpa_relationships.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
       return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
