package Ornek1;

public class MainClass {
    public static void main (String[]args){
        Memeliler memeli=new Memeliler ();
        memeli.beslenme ();
        memeli.bosaltim ();
        memeli.solunum ();
        memeli.sutleBesle ();

        Hayvanlar hayvan=new Hayvanlar ();
        hayvan.beslenme ();
        hayvan.bosaltim ();
        hayvan.solunum ();



        Surungenler surungen=new Surungenler ();
        surungen.beslenme ();
        surungen.bosaltim ();
        surungen.solunum ();
        surungen.surunerekHareket ();
    }
}
