package com.relationships.jpa_relationships.controller;

import com.relationships.jpa_relationships.model.User;
import com.relationships.jpa_relationships.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> createUser(@RequestBody User user){
       User u = userService.createUser(user);
        return ResponseEntity.ok(u);
    }
    @GetMapping("/get")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
