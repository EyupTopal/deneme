package Alistirmalar;
//Random olusturulan bes sayidan en kucugunu ekrana yazan kod

import java.util.Random;
import java.util.Scanner;

public class Soru46_RandomBesSayininEnKucugunuBul {
    public static void main(String[] args) {
    int kucuk=0;
      for (int i=1; i<=5; i++){
          Random rn=new Random ();
          int sayi=rn.nextInt (100)+1;
          System.out.println ("Sayi " + sayi);
          if (i==1){
              kucuk=sayi;
          }
          if (kucuk>sayi){
              kucuk=sayi;
          }
      }
        System.out.println ("Kucuk Sayi = " + kucuk);




    }
}
