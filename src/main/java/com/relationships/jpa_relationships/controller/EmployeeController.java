package com.relationships.jpa_relationships.controller;

import com.relationships.jpa_relationships.model.Employee;
import com.relationships.jpa_relationships.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> emp = employeeService.getAllEmployees();
        return ResponseEntity.ok(emp);
    }
    @PostMapping("/save")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee emp = employeeService.createEmployee(employee);
        return ResponseEntity.ok(emp);
    }
}
