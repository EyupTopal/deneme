package Alistirmalar;

import java.util.Scanner;

// Klavyeden girilen sayiya kadar olan sayiarin faktöriyelini hesaplayan kod?
public class Soru19_MetodluFaktoriyelHesabi {
    public static void main(String[] args) {
        System.out.println ("Lütfen sayi giriniz");
        Scanner scn = new Scanner (System.in);
        int sayi = scn.nextInt ();
        for (int i = 1; i <= sayi; i++) {
            faktoriyelHesapla (i);
        }
    }

    public static void faktoriyelHesapla(int s1) {
        int faktoriyel = 1;
        for (int i = 1; i <= s1; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println (s1 + " in faktoriyeli = " + faktoriyel);
    }
}