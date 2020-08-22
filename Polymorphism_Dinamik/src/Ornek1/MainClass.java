package Ornek1;

public class MainClass {
    public static void main (String []args){
        CalisanInsan insan = new CalisanInsan ();
        insan.maasHesabi ();
        insan.vergiOde ();
        System.out.println ("-------------------------");

        insan=new Muhendis (15000);
        insan.vergiOde ();
        insan.maasHesabi ();

        System.out.println ("///////////////////");

        insan=new Ogretmen (12000);
        insan.maasHesabi ();
        insan.vergiOde ();



    }
}
