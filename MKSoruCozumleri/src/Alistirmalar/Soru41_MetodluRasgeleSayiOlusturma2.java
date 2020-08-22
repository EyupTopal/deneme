package Alistirmalar;

import java.util.Random;
import java.util.Scanner;

// 1 ile girdigin sayi arasinda rasgele sayi olustura kod
public class Soru41_MetodluRasgeleSayiOlusturma2 {
    public static void main(String[] args) {


        System.out.println ("Lütfen Sayi Girin");
        Scanner scn = new Scanner (System.in);
        int sayi = scn.nextInt ();

        Random rn = new Random ();
        int rasgele = rn.nextInt (sayi)+1; //1 ile sayi  arasinda sayi üretir.
        System.out.println (rasgele);
    }
}
