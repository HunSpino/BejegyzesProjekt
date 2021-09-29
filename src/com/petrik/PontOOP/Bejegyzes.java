package com.petrik.PontOOP;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public Integer getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }
    public void like(){
        this.likeok++;
    }

    @Override
    public String toString() {
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return this.szerzo + " - " + this.likeok + " - " + this.letrejott.format(forma) + "\n" +
                "Szerkesztve: " + this.szerkesztve.format(forma) + "\n" +
                this.tartalom + "\n";
    }
}
