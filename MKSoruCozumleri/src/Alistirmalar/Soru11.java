package Alistirmalar;
import java.util.Scanner;
// Klavyeden girilen iki sayinin carpimini carpma islemi yapmadan hesaplayan java kodu?
public class Soru11 {
    public static void main(String[] args) {
        System.out.println ("Ilk sayiyi girin");
        Scanner scn = new Scanner (System.in);
        int sayi1 = scn.nextInt ();
        System.out.println ("Ikinci sayiyi girin");
        Scanner scn2 = new Scanner (System.in);
        int sayi2 = scn2.nextInt ();
        carpma (sayi1, sayi2);
    }
    public static void carpma(int s1, int s2) {
        int toplam = 0;
        for (int i = 1; i <= s1; i++) {
            toplam = toplam + s2;
        }
        System.out.println ("Carpim toplami= "+ toplam);
    }
}
