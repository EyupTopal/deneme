package Alistirmalar;
import java.util.Scanner;
// Klavyeden girilen sayinin 10 a kadar tüm sayilarla carpimini yapan kod?
public class Soru26 {
    public static void main(String[] args) {
        System.out.println ("Bir sayi giriniz");
        Scanner scn = new Scanner (System.in);
        int sayi = scn.nextInt ();
        int toplam=0;
        for (int i=1; i<=10; i++){
            toplam=sayi*i;
            System.out.println (i+ "  "+ toplam);
        }
    }
}
