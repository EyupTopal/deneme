package Alistirmalar;
//Klavyeden Girilen sayiya kadar asal sayilari ekrana yazan java kodu?

import java.util.Scanner;

public class Soru30_MetodluAsalSayi {
    public static void main(String[] args) {
        System.out.println ("Lütfen sayi giriniz");
        Scanner scn = new Scanner (System.in);
        int sayi = scn.nextInt ();
        System.out.println ("-----------------------");
        for (int i = 2; i <= sayi; i++) {
            asalSayi (i);
        }
    }

    public static void asalSayi(int s1) {
        int toplam = 0;
        for (int i = 2; i < s1; i++) {
            if (s1 % i == 0) {
                toplam = toplam + 1;
            }
        }
        if (toplam == 0) {
            System.out.println (s1);
        }
    }
}
