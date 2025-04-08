package com.relationships.jpa_relationships.service;

import com.relationships.jpa_relationships.model.Staff;
import com.relationships.jpa_relationships.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepository;

    public Staff createStaff(Staff staff){
        return staffRepository.save(staff);
    }
    public List<Staff> getAllStaff(){
        return staffRepository.findAll();
    }
}
