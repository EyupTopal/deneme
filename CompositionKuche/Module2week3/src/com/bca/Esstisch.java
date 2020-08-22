package com.bca;

public class Esstisch {

    private String farbe;
    private int personenAnzahl;

    public Esstisch(String farbe, int personenAnzahl) {
        this.farbe = farbe;
        this.personenAnzahl = personenAnzahl;

    }
    public void essen(){
        System.out.println ("Esstisch --> Essen war lecker");
    }
    public void aufraeumen(){
        System.out.println ("Esstisch ---> Esstisch wird aufgeraeumt");
    }

    public String getFarbe() {
        return farbe;
    }

    public int getPersonenAnzahl() {
        return personenAnzahl;
    }

}
