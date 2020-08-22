package Alistirmalar;

public class Soru51MetodluCokluToplama {

    public static void main(String[] args) {
        System.out.println (topla (2,3,5,6,33,23));
        System.out.println ("carp () = " + carp (2,3,65));
    }
    public static int topla(int ... sayilar){
        int toplam=0;
        for (int sayi:sayilar){  //foreach for(int i=0; i<sayilar.length; i++)   {sayi=sayilar[i]..
            toplam += sayi;
        }return toplam;
    }
    public static int carp(int ... sayilar){
        int carpim=1;
        for (int sayi:sayilar){  //foreach for(int i=0; i<sayilar.length; i++)   {sayi=sayilar[i]..
            carpim *= sayi;
        }return carpim;
    }
}
