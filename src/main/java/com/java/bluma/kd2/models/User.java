package com.java.bluma.kd2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    private int id_u;
    private static int userCounter = 1;

    private String username;
    private String password;
    private boolean isVoted;

    public User() {
    }

    public User(String username, String password, boolean isVoted) {
        setUsername(username);
        setPassword(password);
        setVoted(isVoted);
    }

    public int getId_u() {
        return id_u;
    }

    public void setId_u(int id_u) {
        this.id_u = idCounter();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVoted() {
        return isVoted;
    }

    public void setVoted(boolean voted) {
        isVoted = voted;
    }

    @Override
    public String toString() {
        return "User{" +
                "id_u=" + id_u +
                ", username='" + username + '\'' +
                ", isVoted=" + isVoted +
                '}';
    }

    public static int idCounter(){
        return userCounter++;
    }
}
