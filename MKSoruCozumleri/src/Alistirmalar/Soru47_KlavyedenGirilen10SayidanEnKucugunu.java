package Alistirmalar;

import java.util.Scanner;

// Klavyeden Girilen 10 Sayidan En Kucugunu bulan kod
public class Soru47_KlavyedenGirilen10SayidanEnKucugunu {
    public static void main(String[] args) {
        int kucuk = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println ("Lütfen Sayi Girin");
            Scanner scn = new Scanner (System.in);
            int sayi = scn.nextInt ();

            if (i == 1) {
                kucuk = sayi;
            }
            if (kucuk > sayi) {
                kucuk = sayi;
            }
        }
        System.out.println ("Kucuk Sayi = " + kucuk);

    }
}
