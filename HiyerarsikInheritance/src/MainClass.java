import Insan.*;

import java.util.SortedMap;

public class MainClass {
    public static void main (String []args){
    Doktor drMustafa= new Doktor ();
    drMustafa.ameliyatYap ();
    drMustafa.nefesAl ();
    drMustafa.yemekYe ();
        System.out.println ("/////////////////");
    Tamirci usta=new Tamirci ();
    usta.arabaTamiri ();
    usta.nefesAl ();
    usta.yemekYe ();
        System.out.println ("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    Ogretmen hoca=new Ogretmen ();
    hoca.dersVer ();
    hoca.nefesAl ();
    hoca.yemekYe ();
        System.out.println ("------------------------------");
    Muhendis muh =new Muhendis ();
    muh.yazilimProjesiGelistir ();
    muh.nefesAl ();
    muh.yemekYe ();
        System.out.println ("/////////////////////////");
    Insan ins =new Insan();
    ins.nefesAl ();
    ins.yemekYe ();

    }
}
