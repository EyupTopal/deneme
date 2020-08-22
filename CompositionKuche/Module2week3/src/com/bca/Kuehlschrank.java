package com.bca;

public class Kuehlschrank {
    private String farbe;
    private String model;

    public Kuehlschrank(String farbe, String model) {
        this.farbe = farbe;
        this.model = model;
    }

    public void kuehlen()
    {
        System.out.println ("Kuehlschrank--> inhalte sind bei 3 C gekuehlt");
    }

    public String getFarbe() {
        return farbe;
    }

    public String getModel() {
        return model;
    }
}
