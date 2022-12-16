package com.emlakcepte.repository;

import com.emlakcepte.model.Search;
import com.emlakcepte.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    @Autowired
    private static List<User> userList = new ArrayList<>();

    public void createUser(User user){
        userList.add(user);
    }

    public List<User> findAllUsers(){
        return userList;
    }

    public void saveSearh(Search search, User user){
        user.getSearches().add(search);
    }
}
