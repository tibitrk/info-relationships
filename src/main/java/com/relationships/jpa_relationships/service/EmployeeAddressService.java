package com.relationships.jpa_relationships.service;

import com.relationships.jpa_relationships.model.EmployeeAddress;
import com.relationships.jpa_relationships.repository.EmployeeAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeAddressService {

    @Autowired
    private EmployeeAddressRepository employeeAddressRepository;

    public EmployeeAddress saveAddress(EmployeeAddress employeeAddress){
        return employeeAddressRepository.save(employeeAddress);
    }
    public List<EmployeeAddress> getAllAddress(){
        return employeeAddressRepository.findAll();
    }
}
