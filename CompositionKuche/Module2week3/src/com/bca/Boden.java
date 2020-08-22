package com.bca;

public class Boden {
    private String farbe;
    private int laenge;
    private int bereite;

    public Boden(String farbe, int laenge, int bereite) {
        this.farbe = farbe;
        this.laenge = laenge;
        this.bereite = bereite;
    }
    public void putzen(){
        System.out.println ("Boden--> putzen gemacht");
    }

    public String getFarbe() {
        return farbe;
    }

    public int getLaenge() {
        return laenge;
    }

    public int getBereite() {
        return bereite;
    }

}
