package Alistirmalar;
// Girilen Sayiya Kadarki Sayilarin Kare ve Kuplerini Bulan kod

import java.util.Random;
import java.util.Scanner;

public class Soru43_GirilenSayiyaKadarkiSayilarinKareveKupleri {
    public static void main(String[] args) {
        System.out.println ("Lütfen Sayi Girin");
        Scanner scn = new Scanner (System.in);
        int sayi = scn.nextInt ();

        for (int i = 1; i <= sayi; i++) {
            int kare = i * i;
            int kup = i * i * i;
            System.out.println (i + "in karesi= " + kare);
            System.out.println (i + "nin küpü = " + kup);

        }
    }
}