package Alistirmalar;
import java.util.Scanner;
// klavyeden girilen sayinin faktoriyelini hesaplayan kod?
public class Soru6_FaktoriyelHesabi {
    public static void main(String[] args) {
        System.out.println ("Lütfen bir sayi giriniz? ");
        Scanner sn = new Scanner (System.in);
        int sayi = sn.nextInt ();
        int sonuc = faktoriyelHesapla (sayi);
        System.out.println (sonuc);
    }
    public static int faktoriyelHesapla(int sayi) {
        int sonuc=1 ;
        for (int i = 1; i < sayi; i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }
}