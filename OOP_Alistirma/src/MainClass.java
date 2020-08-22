public class MainClass {
    public static void main (String[] args){
  Hesapla hesapla=new Hesapla ();
  boolean asalKontrol=hesapla.asalSayiKontrol (10);
    int faktoriyelHesabi=hesapla.faktoriyelHesapla (10);
    hesapla.kare (10);
    hesapla.kupBul (10);
    boolean pozNegatif=hesapla.pozitifNegatif (-125);

        System.out.println (asalKontrol);
        System.out.println (faktoriyelHesabi);
        System.out.println (pozNegatif);

    }
}
