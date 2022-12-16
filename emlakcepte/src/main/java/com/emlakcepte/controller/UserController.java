package com.emlakcepte.controller;


import com.emlakcepte.model.User;
import com.emlakcepte.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll(){

        System.out.println("getAll() UserService :: " + userService);
        return userService.getAllUser();
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){

        userService.createUser(user);
        System.out.println("create() UserService :: " + userService);

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/{email}")
    public User getByEmail(@PathVariable String email){

        System.out.println("Gelen email requesti :: " + email);

        System.out.println("getByEmail() UserService :: " + userService );
        return userService.getByEmail(email);

    }





}
