package Alistirmalar;

import java.util.Scanner;

// Bir fabrikada maas hesabi yapilirken kriterler:
//eger isci 40 saat alti calismissa saat ve saat ücreti carpilarak,
// eger 40 saati gecmisse %21 zam eklenerek maaslar ödeniyor. Scanner kullan haftalik maasi hesapla
public class Soru45_MetodluFabrikaMaasHesabi {
    public static void main(String[] args) {
        System.out.println ("Lütfen calisma saatini girin");
        Scanner csaat = new Scanner (System.in);
        double saat = csaat.nextInt ();

        System.out.println ("Lütfen saat ücretini girin");
        Scanner cucret = new Scanner (System.in);
        double ucret = cucret.nextInt ();

        maasHesabi (saat, ucret);
        System.out.println ();
    }

    public static void maasHesabi(double saat, double ucret) {
        double total = 0;
        if (saat <= 40) {
            total = saat * ucret;
        } else {
            ucret=((ucret*21)/100)+ucret;
            total = saat * ucret;
        }
        System.out.println ("total = " + total);
    }

}
