package Alistirmalar;

import java.util.Scanner;

//Klavyeden -1  gelene kadar girilen sayilarin toplamini yapan kod?
public class Soru8_EksiGireneKadarkiSayilariTopla {
    public static void main(String[] args) {
        System.out.println ("Lütfen bir sayi giriniz");
        Scanner scn = new Scanner (System.in);
        int deger = scn.nextInt ();
        int toplam = 0;
        while (deger != -1) {
            toplam = toplam + deger;
            System.out.println ("sayi girin");
            Scanner scn2 = new Scanner (System.in);
            deger = scn2.nextInt ();
        }
        System.out.println ("Girilen Sayilarin Toplami = "+ toplam);
    }
}
