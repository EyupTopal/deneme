package Alistirmalar;

import java.util.Scanner;

public class Soru39_MetodluMukemmelSayi {
    public static void main(String[] args) {
        System.out.println ("Lütfen Sayi Girin");
        Scanner scn=new Scanner (System.in);
        int sayi =scn.nextInt ();
        for (int i = 1; i <= sayi; i++)
            mukemmelSayi (i);
    }

    public static void mukemmelSayi(int s1) {

        int toplam = 0;
        for (int i = 1; i < s1; i++) {
            if (s1 % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == s1) {
            System.out.println (s1);
        }
    }
}
