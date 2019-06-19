package com.java.bluma.kd2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class Candidate implements Serializable {
    @Id
    private int id_c;
    private static int candCounter = 100;

    private String name;
    private String surname;
    private int votes;

    @OneToOne
    @JoinColumn
    private Party id_p;

    public Candidate() {
    }

    public Candidate(String name, String surname, int votes, Party id_p) {
        this.id_c = idCounter();
        this.name = name;
        this.surname = surname;
        this.votes = votes;
        this.id_p = id_p;
    }

    public int getId_c() {
        return id_c;
    }

    public void setId_c(int id_c) {
        this.id_c = idCounter();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public Party getId_p() {
        return id_p;
    }

    public void setId_p(Party id_p) {
        this.id_p = id_p;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id_c=" + id_c +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", votes=" + votes +
                ", id_p=" + id_p +
                '}';
    }

    public static int idCounter(){
        return candCounter++;
    }
}
