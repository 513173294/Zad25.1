package com.example.demo;


import javax.persistence.*;

@Entity
public class Wspolnota {

    @Id
    @GeneratedValue
    private Long Id;
    private String nazwaWspolnoty;
    @ManyToOne
    private Adres adres;
    @ManyToOne
    private Mieszkanie mieszkanie;


    public String getNazwaWspolnoty() {
        return nazwaWspolnoty;
    }

    public void setNazwaWspolnoty(String nazwaWspolnoty) {
        this.nazwaWspolnoty = nazwaWspolnoty;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public Mieszkanie getMieszkanie() {
        return mieszkanie;
    }

    public void setMieszkanie(Mieszkanie mieszkanie) {
        this.mieszkanie = mieszkanie;
    }
}