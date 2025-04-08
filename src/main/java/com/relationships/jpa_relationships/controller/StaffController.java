package com.relationships.jpa_relationships.controller;

import com.relationships.jpa_relationships.model.Staff;
import com.relationships.jpa_relationships.model.StaffDetails;
import com.relationships.jpa_relationships.repository.StaffDetailsRepository;
import com.relationships.jpa_relationships.service.StaffDetailsService;
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
    @Autowired
    private StaffDetailsService staffDetailsService;

    @PostMapping
    public ResponseEntity<Staff> createStaff(@RequestBody Staff staff){
        return ResponseEntity.ok(staffService.createStaff(staff));
    }
    @GetMapping
    public ResponseEntity<List<Staff>> getAllStaff(){
        return ResponseEntity.ok(staffService.getAllStaff());
    }
    @PostMapping("/details")
    public ResponseEntity<StaffDetails> createStaffDetails(@RequestBody StaffDetails staffDetails){
        return ResponseEntity.ok(staffDetailsService.createStaffDetails(staffDetails));
    }
    @GetMapping("/details")
    public ResponseEntity<List<StaffDetails>> getAllStaffDetails(){
        return ResponseEntity.ok(staffDetailsService.getAllDetails());
    }
}
