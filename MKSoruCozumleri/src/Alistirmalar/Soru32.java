package Alistirmalar;

import java.util.Scanner;

// Klavyeden girilen sayiyi 11 ile bölüp 2 ile carpan kodu?
public class Soru32 {
    public static void main(String[] args) {
        System.out.println ("Lütfen bir sayi giriniz");
        Scanner scn=new Scanner (System.in);
        double sayi=scn.nextInt ();

        double sonuc=(sayi/11)*2;
        System.out.println (sonuc);
    }

}
