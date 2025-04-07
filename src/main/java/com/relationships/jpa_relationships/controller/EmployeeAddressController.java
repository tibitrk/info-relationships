package com.relationships.jpa_relationships.controller;

import com.relationships.jpa_relationships.model.EmployeeAddress;
import com.relationships.jpa_relationships.service.EmployeeAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("address")
public class EmployeeAddressController {

    @Autowired
    private EmployeeAddressService employeeAddressService;

    @PostMapping
    public EmployeeAddress createAddress(@RequestBody EmployeeAddress employeeAddress){
        return employeeAddressService.saveAddress(employeeAddress);
    }
    @GetMapping
    public List<EmployeeAddress> getAllAddress(){
        return employeeAddressService.getAllAddress();
    }
}
