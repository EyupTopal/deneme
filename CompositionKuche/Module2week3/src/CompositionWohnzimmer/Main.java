package CompositionWohnzimmer;

public class Main {
    public static void main(String[] args) {
    Fernsehen tv=new Fernsehen ("Siyah",102,5,"Samsung");
    Sofa sofa1= new Sofa ("Gri", 50,"L seklinde");
    Balcon balcon1=new Balcon (5,10);
    Tisch tisch1=new Tisch ("Beyaz", 3,5,2);
    wohnZimmer wohnZimmer=new wohnZimmer (balcon1,tv,sofa1,tisch1);

    wohnZimmer.wohnungInDerWZ ();
    }
}
