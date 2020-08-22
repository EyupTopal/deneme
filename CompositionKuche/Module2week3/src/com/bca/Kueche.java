package com.bca;

public class Kueche {

    private Esstisch esstisch;
    private  Boden boden;
    private Kuehlschrank kuehlschrank;

    public Kueche(Esstisch esstisch, Boden boden, Kuehlschrank kuehlschrank) {
        this.esstisch = esstisch;
        this.boden = boden;
        this.kuehlschrank = kuehlschrank;
    }

    public void essenInDerKueche()
    {
        boden.putzen ();
        kuehlschrank.kuehlen ();
        esstisch.essen ();
        esstisch.aufraeumen ();
    }

    public Esstisch getEsstisch() {
        return esstisch;
    }

    public Boden getBoden() {
        return boden;
    }

    public Kuehlschrank getKuehlschrank() {
        return kuehlschrank;
    }
}
