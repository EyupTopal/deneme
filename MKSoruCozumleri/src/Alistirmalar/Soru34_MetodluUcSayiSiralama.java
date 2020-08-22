package Alistirmalar;

import java.util.Scanner;

// Klavyeden aldigin üc sayiyi sirala
public class Soru34_MetodluUcSayiSiralama {
    public static void main(String[] args) {
        System.out.println ("Birinci sayiyi giriniz");
        Scanner scn1 = new Scanner (System.in);
        int sayi1 = scn1.nextInt ();

        System.out.println ("ikinci sayiyi giriniz");
        Scanner scn2 = new Scanner (System.in);
        int sayi2 = scn2.nextInt ();

        System.out.println ("Ücüncü sayiyi giriniz");
        Scanner scn3 = new Scanner (System.in);
        int sayi3 = scn3.nextInt ();
        buyuktenKucugeSirala (sayi1,sayi2,sayi3);
    }

    public static void buyuktenKucugeSirala(int s1, int s2, int s3) {
        if (s1 > s2) {
            if (s1 > s3) {
                if (s2 > s3) {
                    System.out.println (s1 + "-" + s2 + "-" + s3);
                } else {
                    System.out.println (s1 + "-" + s3 + "-" + "s2");
                }
            } else {
                System.out.println (s3 + "-" + s1 + "-" + s2);
            }
        } else {
            if (s2 > s3) {
                if (s1 > s3) {
                    System.out.println (s2 + "-" + s1 + "-" + s3);
                } else {
                    System.out.println (s2 + "-" + s3 + "-" + s1);
                }
            } else {
                System.out.println (s3 + "-" + s2 + "-" + s1);
            }
        }
    }
}

