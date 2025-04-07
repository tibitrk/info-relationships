package com.relationships.jpa_relationships.repository;

import com.relationships.jpa_relationships.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
