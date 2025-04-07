package com.relationships.jpa_relationships.service;

import com.relationships.jpa_relationships.model.Department;
import com.relationships.jpa_relationships.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department){
        return departmentRepository.save(department);
    }
    public List<Department> getAllDepartmant(){
        return departmentRepository.findAll();
    }
}
