package com.relationships.jpa_relationships.repository;

import com.relationships.jpa_relationships.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
