package com.relationships.jpa_relationships.repository;

import com.relationships.jpa_relationships.model.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, Long> {
}
