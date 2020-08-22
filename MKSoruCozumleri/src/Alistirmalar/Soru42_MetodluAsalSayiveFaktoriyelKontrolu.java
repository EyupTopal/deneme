package Alistirmalar;

import java.util.Random;
import java.util.Scanner;

// Olusturulan rasgele sayinin faktoriyelini hesaplayan asal sayi olup olmadigini kontrol  eden kod
public class Soru42_MetodluAsalSayiveFaktoriyelKontrolu {
    public static void main(String[] args) {

        Random rn = new Random ();
        int rasgele = rn.nextInt (10);
        System.out.println (rasgele);
        faktoriyelHesapla (rasgele);
        asalSayiKontrol (rasgele);
    }
    public static void faktoriyelHesapla(int s1) {
        int faktoriyel = 1;
        for (int i = 1; i <= s1; i++) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println (s1 + " in faktoriyeli = " + faktoriyel);
    }
    public static void asalSayiKontrol (int s1) {
        int toplam = 0;
        for (int i = 2; i < s1; i++) {
            if (s1 % i == 0) {
                toplam = toplam + 1;
            }
        }
        if (toplam == 0) {
            System.out.println (s1+ " sayisi asal sayidir");
        }else{
            System.out.println (s1+ " sayisi asal degildir");
        }
    }
}
