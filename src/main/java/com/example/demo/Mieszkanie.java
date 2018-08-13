package com.example.demo;

import javax.persistence.*;

@Entity
public class Mieszkanie {
    @Id
    @GeneratedValue
    private Long Id;
    private int numer;
    private double powierzchnia;

    public Long getId() {
        return Id;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public double getPowierzchnia() {
        return powierzchnia;
    }

    public void setPowierzchnia(double powierzchnia) {
        this.powierzchnia = powierzchnia;
    }
}
