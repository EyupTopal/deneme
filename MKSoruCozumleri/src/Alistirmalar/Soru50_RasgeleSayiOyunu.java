package Alistirmalar;

import java.util.Random;
import java.util.Scanner;

// Rasgele olusturulan bir sayiyi bulan bir oyun tasarlayin, girilen sayi rasgele
// olusturulan sayidan büyük ya da kücükse bilgilendirsin, kullanicinin üc hakki olsun, oyun bitince
//oyundan ciksin.
public class Soru50_RasgeleSayiOyunu {
    public static void main(String[] args) {

            Random rnd = new Random ();
            int rsayi = rnd.nextInt (10) + 1;
        for (int i = 1; i <= 3; i++) {
            System.out.println ("Sayi gir");
            Scanner scn = new Scanner (System.in);
            int ssayi = scn.nextInt ();
            if (ssayi == rsayi) {
                System.out.println ("Girilen sayi esittir");
                return;
            } else if (ssayi < rsayi){
                System.out.println ("Girilen sayi kücüktür");
            }else {
                System.out.println ("Girilen sayi büyüktür");
            }
        }System.out.println ("sayi= "+rsayi);
    }
}