package com.relationships.jpa_relationships.controller;

import com.relationships.jpa_relationships.model.Department;
import com.relationships.jpa_relationships.repository.DepartmentRepository;
import com.relationships.jpa_relationships.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department){
        Department dep = departmentService.createDepartment(department);
        return ResponseEntity.ok(dep);
    }
    @GetMapping("/get")
    public ResponseEntity<List<Department>> getAllDepartment(){
        List<Department> dep = departmentService.getAllDepartmant();
        return ResponseEntity.ok(dep);
    }
}
