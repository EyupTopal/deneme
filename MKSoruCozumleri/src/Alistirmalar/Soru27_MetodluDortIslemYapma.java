package Alistirmalar;

import java.util.Scanner;

// Ekrana once iki sayi giriyoruz, sonra sececegimiz islemi giriyoruz. Program sectigimiz isleme göre girdigimiz iki sayiyi
//hesapliyor.

public class Soru27_MetodluDortIslemYapma {
    public static void main(String[] args) {
        System.out.println ("Birinci sayiyi giriniz");
        Scanner scn1 = new Scanner (System.in);
        int sayi1 = scn1.nextInt ();

        System.out.println ("Ikinci Sayiyi Giriniz");
        Scanner scn2 = new Scanner (System.in);
        int sayi2 = scn2.nextInt ();

        System.out.println ("Toplama icin 1 tusuna basin");
        System.out.println ("Cikarma icin 2 tusuna basin");
        System.out.println ("Carpma icin 3 tusuna basin");
        System.out.println ("Bolme icin 4tusuna basin");

        Scanner scn3 = new Scanner (System.in);
        int secim = scn3.nextByte ();

        if (secim == 1) {
            topla (sayi1, sayi2);
        } else if (secim == 2) {
            cikar (sayi1, sayi2);
        } else if (secim == 3) {
            carp (sayi1, sayi2);
        } else {
            bolme (sayi1, sayi2);
        }
    }

    public static void topla(int s1, int s2) {
        int sonuc = s1 + s2;
        System.out.println ("Toplama islemi sonuc= " + sonuc);
    }

    public static void cikar(int s1, int s2) {
        int sonuc = s1 - s2;
        System.out.println ("Cikarma islemi sonuc= " + sonuc);
    }

    public static void carp(int s1, int s2) {
        int sonuc = s1 * s2;
        System.out.println ("Carpma islemi sonuc= " + sonuc);
    }

    public static void bolme(int s1, int s2) {
        double s1Double = (double)s1;
        double s2Double = (double)s2;
        double sonuc = s1Double / s2Double;
        System.out.println ("Bolme islemi sonuc= " + sonuc);
    }
}
