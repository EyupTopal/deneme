public class hayvanAlemi {
     public String  isim;
    public int yas;
    public static void main (String [] args) {
        hayvanAlemi kedi = new hayvanAlemi ();

        kedi.Beslenme ();
        kedi.Hareket ();
        kedi.Solunum ();
       kedi.Sindirim ();
        kedi.yas = 5;
        kedi.isim = "Pamuk";
        System.out.println ("----------------------------------");
        hayvanAlemi civciv = new hayvanAlemi ();

        civciv.Beslenme ();
        civciv.Hareket ();
        civciv.Solunum ();
        civciv.Sindirim ();
        civciv.yas = 0;
        civciv.isim = "Zilli";
        System.out.println ("////////////////////////////////////////////////////");
        System.out.println (kedi.isim+"  "+civciv.isim);
        System.out.println ("*************************************************");
        System.out.println (kedi.yas+"  "+kedi.yas);
        System.out.println ("--------------------------------------");

        Insan eyup=new Insan();
        eyup.boy=170;
        eyup.kilo=75;
        eyup.sacRengi="Siyah";
        eyup.gozRengi="Ela";
        eyup.yas=28;
        eyup.isim="Eyüp";

        eyup.isimYaz ();
        eyup.boyYaz ();
        eyup.kiloYaz ();
        eyup.gozRengiYaz ();
        eyup.sacRengiYaz ();
        eyup.yasYaz ();
        System.out.println ("--------------------------------------");

        Insan rabia=new Insan();
        rabia.isim="Rabia";
        rabia.boy=159;
        rabia.kilo=56;
        rabia.sacRengi="Sari";
        rabia.gozRengi="mavi";
        rabia.yas=25;

        rabia.isimYaz ();
        rabia.sacRengiYaz ();
        rabia.gozRengiYaz ();
        rabia.yasYaz ();
        rabia.kiloYaz ();
        rabia.boyYaz ();


    }

     public void Solunum(){
         System.out.println ("Solunum Yapar");
     }
    public void Sindirim(){
        System.out.println ("Sindirir");
    }
    public void Hareket(){
        System.out.println ("Hareket eder");
    }
    public void Beslenme(){
        System.out.println ("Beslenir");

    }
    }

