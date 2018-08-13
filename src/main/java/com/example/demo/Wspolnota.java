package com.example.demo;


import javax.persistence.*;
import java.util.List;

@Entity
public class Wspolnota {

    @Id
    @GeneratedValue
    private Long Id;
    private String nazwaWspolnoty;
    @OneToMany
    private List<Adres> adres;
    @OneToMany
    private List<Mieszkanie> mieszkanie;



    public String getNazwaWspolnoty() {
        return nazwaWspolnoty;
    }

    public void setNazwaWspolnoty(String nazwaWspolnoty) {
        this.nazwaWspolnoty = nazwaWspolnoty;
    }

    public List<Adres> getAdres() {
        return adres;
    }

    public void setAdres(List<Adres> adres) {
        this.adres = adres;
    }

    public List<Mieszkanie> getMieszkanie() {
        return mieszkanie;
    }

    public void setMieszkanie(List<Mieszkanie> mieszkanie) {
        this.mieszkanie = mieszkanie;
    }
}