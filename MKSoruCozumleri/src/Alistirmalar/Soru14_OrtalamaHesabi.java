package Alistirmalar;
import java.util.Scanner;
//Klavyeden girilen 10 sayinin ortalamasini bulan kod?
public class Soru14_OrtalamaHesabi {
    public static void main(String[] args) {
        double topla = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println (i + " nci sayiyi giriniz");
            Scanner scn = new Scanner (System.in);
            double sayi = scn.nextInt ();
            topla = topla + sayi;
        }
        double ort = (double) (topla / 10);
        System.out.println ("Girilen sayilarin ortalamasi= " + ort);
    }
}

