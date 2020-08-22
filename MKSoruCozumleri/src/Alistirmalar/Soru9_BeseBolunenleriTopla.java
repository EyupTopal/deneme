package Alistirmalar;
import java.util.Scanner;
//Klavyeden girilen 10 sayidan 5e bölünenlerin toplamini bulan kod?
public class Soru9_BeseBolunenleriTopla {
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println ("Lütfen sayi girin");
            Scanner scn = new Scanner (System.in);
            int sayi = scn.nextInt ();
            if (sayi % 5 == 0) {
                toplam = toplam + sayi;
            }
        }
        System.out.println ("Toplam deger" + toplam);

    }
}
