import Multi.Araba;
import Multi.Hundai;
import Multi.HundaiI20;

public class Main {
    public static void main (String []args){
        HundaiI20 i20 =new HundaiI20 ();
        i20.hiz (240);
        i20.marka ();
        i20.model (2009);
        i20.renk ("yesil");
        i20.yakitTipi ("benzin");
        System.out.println ("-------------------------------");

        Hundai hnd=new Hundai ();
        hnd.marka ();
        hnd.model (2001);
        hnd.renk ("Beyaz");
        hnd.yakitTipi ("benzin");
        System.out.println ("**********************************");

        Araba araba=new Araba ();
        System.out.println ("Arabanin ");
        araba.model (2000);
        araba.renk ("beyaz");
        araba.yakitTipi ("dizel");


    }
}
