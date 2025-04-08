package com.relationships.jpa_relationships.controller;

import com.relationships.jpa_relationships.model.Staff;
import com.relationships.jpa_relationships.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @PostMapping
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff){
        return ResponseEntity.ok(staffService.createStaff(staff));
    }
    @GetMapping
    public ResponseEntity<List<Staff>> getAllStaff(){
        return ResponseEntity.ok(staffService.getAllStaff());
    }
}
