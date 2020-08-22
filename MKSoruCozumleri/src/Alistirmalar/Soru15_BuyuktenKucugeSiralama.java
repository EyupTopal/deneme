package Alistirmalar;
import java.util.Scanner;
// Klavyeden girilen pozitif bir sayidan baslayip büyükten kücüge siralayan kodu?
public class Soru15_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        System.out.println ("lütfen ekrana sayi giriniz");
        Scanner scn = new Scanner (System.in);
        int sayi = scn.nextInt ();
        if (sayi > 0) {
            for (int i = (sayi-1); i >= 1; i--) {
                System.out.println (i);
            }
        } else {
            System.out.println ("Pozitif sayi giriniz");
        }
    }
}
