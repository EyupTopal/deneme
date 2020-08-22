package Alistirmalar;
import java.util.Scanner;
// Disaridan girilen sayilarin toplami 110dan fazla oldugunda bize kac adet sayi girildigini söyleyen kod?
public class Soru16_UstToplamiBuluncaAdetBildir {
    public static void main(String[] args) {
        int toplam = 0;
        int sayac = 0;
        while (toplam <= 110) {
            System.out.println ((sayac+1) + " nci sayiyi giriniz");
            Scanner scn = new Scanner (System.in);
            int sayi = scn.nextInt ();
            toplam = toplam + sayi;
            sayac = sayac + 1;
        }
        System.out.println ("-----------------------------");
        System.out.println (sayac+" sayi girdiniz");
    }
}
