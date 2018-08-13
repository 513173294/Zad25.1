package com.example.demo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Adres {

    @Id
    @GeneratedValue
    private Long Id;
    private String ulica;
    private int nr;
    @OneToMany(mappedBy = "adres")
    private List<Wspolnota> wspolnota;

    public List<Wspolnota> getWspolnota() {
        return wspolnota;
    }

    public void setWspolnota(List<Wspolnota> wspolnota) {
        this.wspolnota = wspolnota;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
