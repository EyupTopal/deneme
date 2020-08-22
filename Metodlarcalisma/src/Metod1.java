public class Metod1 {


    public static void main(String[] args) {
        konsolaCiktiBas ();
        ayir ();
        parametreliKonsolaCiktiBas ("eyüp" );
        ayir ();
        faktoriyelHesapla (8);
        ayir ();
        dikUcgenCiz (20);
        ayir ();
       normalUcgenCiz (20);
        ayir ();
        kareCiz (10);
    }
    public static void konsolaCiktiBas()
    {
        System.out.println ("Kapsamli Java Egitimmi");
    }
    public static void ayir()
    {
        System.out.println ("-------------------");
    }
    public static void parametreliKonsolaCiktiBas(String isim)
    {
        System.out.println (isim);
    }

    public static void faktoriyelHesapla(int sayi)
    {
        int faktoriyel = 1;
        for (int i = sayi; i>=1; i--)
        { faktoriyel= faktoriyel * i;
        }
        System.out.println (sayi + "in faktöriyeli = " + faktoriyel );
    }
    public static void dikUcgenCiz(int boyut)
    {
        for (int i=0; i<=boyut; i++)
        {   for(int k=0; k<=i; k++)
        {
            System.out.print ("*");
        }
            System.out.println ();
    }}
    public static void normalUcgenCiz(int boyut) {
        for (int i = 1; i <= boyut; i++) {
            for (int x = boyut; x >= i; x--) {
                System.out.print (" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print ("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print ("*");
            }
        }
    }
    public static void kareCiz (int boyut) {
        for(int i=1; i<=boyut; i++);{
            for (int k=1; k<=boyut; k++){
                System.out.print ("*");
            }
            System.out.print ("*");
        }
    }




}


