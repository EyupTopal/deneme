package Alistirmalar;

import java.util.Scanner;

// Girilen 5 sayinin aritmetik ortalamasini veren kod?
public class Soru24_AritmetikOrtalama {
    public static void main(String[] args) {
        double topla = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println (i + " nci sayiyi giriniz");
            Scanner scn = new Scanner (System.in);
            double sayi = scn.nextInt ();
            topla = topla + sayi;
        }
        double ort = (double) (topla / 5);
        System.out.println ("Girilen sayilarin ortalamasi= " + ort);
    }
}

