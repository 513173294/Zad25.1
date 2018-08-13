package com.example.demo;


import javax.persistence.*;
import java.util.List;

@Entity
public class Wspolnota {

    @Id
    @GeneratedValue
    private Long Id;
    private String nazwaWspolnoty;
    @ManyToOne
    private Adres adres;
    @OneToMany
    private List<Mieszkanie> listaMieszkan;



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

    public List<Mieszkanie> getMieszkanie() {
        return listaMieszkan;
    }

    public void setMieszkanie(List<Mieszkanie> mieszkanie) {
        this.listaMieszkan = mieszkanie;
    }
}