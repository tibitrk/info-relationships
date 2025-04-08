package com.relationships.jpa_relationships.repository;

import com.relationships.jpa_relationships.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}
