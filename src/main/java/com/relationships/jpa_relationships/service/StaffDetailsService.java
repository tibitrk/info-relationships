package com.relationships.jpa_relationships.service;

import com.relationships.jpa_relationships.model.StaffDetails;
import com.relationships.jpa_relationships.repository.StaffDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StaffDetailsService {

    @Autowired
    private StaffDetailsRepository staffDetailsRepository;

    public StaffDetails createStaffDetails(@RequestBody StaffDetails staffDetails){
        return staffDetailsRepository.save(staffDetails);
    }
    public List<StaffDetails> getAllDetails(){
        return staffDetailsRepository.findAll();
    }
}
