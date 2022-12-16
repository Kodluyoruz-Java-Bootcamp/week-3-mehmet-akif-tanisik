package com.emlakcepte.service;

import com.emlakcepte.model.Search;
import com.emlakcepte.model.User;
import com.emlakcepte.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user){
        userRepository.createUser(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAllUsers();
    }

    public void printAllUsers(){
        getAllUser().forEach(user -> System.out.println(user.getName() +" " +user.getEmail()));
    }

    public void saveSearch(Search search, User user){

        userRepository.saveSearh(search, user);
    }

    public User getByEmail(String email){
        return userRepository.findAllUsers().stream()
                .filter(user -> user.getEmail().equals(email))
                .findFirst()
                .get();
    }



}
