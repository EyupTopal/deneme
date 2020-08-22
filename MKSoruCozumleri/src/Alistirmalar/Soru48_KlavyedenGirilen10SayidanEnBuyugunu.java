package Alistirmalar;

import java.util.Scanner;

//Klavyeden Girilen 10 Sayidan En Buyugunu Hesaplayan Kod
public class Soru48_KlavyedenGirilen10SayidanEnBuyugunu {
    public static void main(String[] args) {
        int buyuk = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.println ("Lütfen Sayi Girin");
            Scanner scn = new Scanner (System.in);
            int sayi = scn.nextInt ();
           if (i==1){
               buyuk=sayi;
           }
            if (sayi > buyuk) {
                buyuk=sayi;
            }
        }
        System.out.println ("buyuk = " + buyuk);
    }
}
