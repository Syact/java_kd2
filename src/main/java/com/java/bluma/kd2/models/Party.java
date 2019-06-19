package com.java.bluma.kd2.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Party {

    @Id
    private int id_p;
    private static int partyCounter = 1000;

    private String title;

    public Party() {
    }

    public Party(String title) {
        this.id_p = idCounter();
        setTitle(title);
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = idCounter();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Party{" +
                "id_p=" + id_p +
                ", title='" + title + '\'' +
                '}';
    }

    public static int idCounter(){
        return partyCounter++;
    }
}
