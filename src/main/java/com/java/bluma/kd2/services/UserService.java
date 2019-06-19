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

    public void generateUsers(){

        User user1 = new User("admin", "admin", false);
        User user2 = new User("user1", "123", false);
        User user3 = new User("user2", "321", true);

        userRepo.save(user1);
        userRepo.save(user2);
        userRepo.save(user3);
    }

    public List<User> retrieveAllUsers(){
        List<User> users = new ArrayList<>();
        for (User user:userRepo.findAll()) {
            users.add(user);
        }
        return users;
    }
}
