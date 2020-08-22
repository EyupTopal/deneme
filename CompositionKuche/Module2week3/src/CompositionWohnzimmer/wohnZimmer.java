package CompositionWohnzimmer;

public class wohnZimmer {
    private Balcon balcon;
    private Fernsehen fernsehen;
    private Sofa sofa;
    private Tisch tisch;

    public wohnZimmer(Balcon balcon, Fernsehen fernsehen, Sofa sofa, Tisch tisch) {
        this.balcon = balcon;
        this.fernsehen = fernsehen;
        this.sofa = sofa;
        this.tisch = tisch;
    }
    public void wohnungInDerWZ(){
        fernsehen.belgeselIzle ();
        fernsehen.filmizle ();
        sofa.putzen ();
      //  sofa.sitzen ();
        tisch.yaziYaz ();
        tisch.resimYap ();
    }


    public Balcon getBalcon() {
        return balcon;
    }

    public Fernsehen getFernsehen() {
        return fernsehen;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Tisch getTisch() {
        return tisch;
    }
}
