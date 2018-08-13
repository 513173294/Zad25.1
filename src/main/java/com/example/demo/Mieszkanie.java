package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Mieszkanie {
    @Id
    @GeneratedValue
    private Long Id;
    private int numer;
    private double powierzchnia;
    @ManyToOne
    private Wspolnota wspolnota;
    @OneToMany
    private List<Mieszkaniec>mieszkancy;


    public List<Mieszkaniec> getMieszkancy() {
        return mieszkancy;
    }

    public void setMieszkancy(List<Mieszkaniec> mieszkancy) {
        this.mieszkancy = mieszkancy;
    }

    public Wspolnota getWspolnota() {
        return wspolnota;
    }

    public void setWspolnota(Wspolnota wspolnota) {
        this.wspolnota = wspolnota;
    }

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
