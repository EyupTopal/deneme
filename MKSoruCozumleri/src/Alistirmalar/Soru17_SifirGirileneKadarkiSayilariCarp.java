package Alistirmalar;

import java.util.Scanner;

// Klavyeden 0 girilene kadar girilen sayilarin carpimini veren kod?
public class Soru17_SifirGirileneKadarkiSayilariCarp {
    public static void main(String[] args) {
        System.out.println ("Lütfen sayi giriniz");
        Scanner scn = new Scanner (System.in);
        int sayi = scn.nextInt ();
        int carpimtoplam = 1;
        while (sayi != 0) {
            carpimtoplam = carpimtoplam * sayi;
            System.out.println ("Lütfen sayi giriniz");
            Scanner scn2 = new Scanner (System.in);
            sayi = scn2.nextInt ();
        }
        System.out.println ("Girilen Sayilarin Carpimi = " + carpimtoplam);
    }
}
