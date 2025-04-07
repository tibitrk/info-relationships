package com.relationships.jpa_relationships.repository;

import com.relationships.jpa_relationships.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
