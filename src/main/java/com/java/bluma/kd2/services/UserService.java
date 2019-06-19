package com.java.bluma.kd2.services;

import com.java.bluma.kd2.models.User;
import com.java.bluma.kd2.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User retrieveUserByNameAndPass(String username, String password){

        List<User> usersInDb = new ArrayList<>();
        for (User user : userRepo.findAll()){
            usersInDb.add(user);
        }

        for (User user : usersInDb){
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        System.err.println("User not found");
        return null;
    }
}
