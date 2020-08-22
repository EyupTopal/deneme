package Alistirmalar;
import java.util.Scanner;
// Girilen sayinin hangi sayinin karekökü oldugunu bulan kod?

public class Soru23_HangiSayininKarekoku {
    public static void main(String[] args) {
        System.out.println ("Lütfen sayi giriniz");
        Scanner scn = new Scanner (System.in);
        int sayi = scn.nextInt ();

        int i = 1;
        while ((i * i) != sayi && i <= (sayi / 2)) ;
        {
            i = i + 1;
        }
        if ((i * i) == sayi) {
            System.out.println (sayi + "  " + i + " nin karesidir.");
        }
    }
}
