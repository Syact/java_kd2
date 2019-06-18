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



}
