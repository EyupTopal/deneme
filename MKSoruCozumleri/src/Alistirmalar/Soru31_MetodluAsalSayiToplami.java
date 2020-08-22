package Alistirmalar;

import java.util.Scanner;

// Klavyeden girilen sayiya kadar asal sayilarin toplamini veren kod?
public class Soru31_MetodluAsalSayiToplami {
    public static int asalSayiToplam=0;

    public static void main(String[] args) {

        System.out.println ("Lütfen sayi giriniz");
        Scanner scn = new Scanner (System.in);
        int sayi = scn.nextInt ();
        System.out.println ("-----------------------");
        int toplam = 0;
        for (int i = 2; i <= sayi; i++) {
            asalSayi (i);
        }
        System.out.println ("Asal Sayi Toplam = "+ asalSayiToplam);
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
            asalSayiToplam=asalSayiToplam+s1;
        }
    }

}

