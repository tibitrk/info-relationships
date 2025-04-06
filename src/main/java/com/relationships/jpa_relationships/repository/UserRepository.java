package com.relationships.jpa_relationships.repository;

import com.relationships.jpa_relationships.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
