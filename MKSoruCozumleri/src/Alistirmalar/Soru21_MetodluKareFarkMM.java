package Alistirmalar;
import java.util.Scanner;

// Girilen iki sayinin karelerinin farkini bulan kod?
public class Soru21_MetodluKareFarkMM {
    public static void main(String[] args) {
        System.out.println ("Ilk sayiyi giriniz");
        Scanner scn = new Scanner (System.in);
        int s1 = scn.nextInt ();

        System.out.println ("Ikinci sayiyi giriniz");
        Scanner scn2 = new Scanner (System.in);
        int s2 = scn2.nextInt ();
        kareFark (s1,s2);
    }

    public static void kareFark(int s1, int s2) {
        int kares1 = s1 * s1;
        int kares2 = s2 * s2;
        int kareFark = kares1 - kares2;
        if (kareFark > 0) {
            System.out.println ("Karelerin farki = " + kareFark);
        } else {
            kareFark = kares2 - kares1;
            System.out.println ("karelerin farki = " + kareFark);
        }
    }
}
