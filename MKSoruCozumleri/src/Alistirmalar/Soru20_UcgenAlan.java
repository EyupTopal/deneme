package Alistirmalar;

import java.util.Scanner;

// Tabani ve yüksekligi girilen ücgenin alanini hesaplayan kod?
public class Soru20_UcgenAlan {
    public static void main(String[] args) {
        System.out.println ("Tabanini giriniz");
        Scanner scn = new Scanner (System.in);
        int tabanKenar = scn.nextInt ();

        System.out.println ("Yüksekligini giriniz");
        Scanner scn2 = new Scanner (System.in);
        int dikKenar = scn2.nextInt ();
        ucgenAlan (tabanKenar, dikKenar);
    }
public static void ucgenAlan(int tab, int yuk){
        int ucgenAlan=(tab*yuk)/2;
    System.out.println ("Tabani = "+ tab+ " , yüksekligi = "+ yuk+ " olan ücgenin alani ="+ ucgenAlan );
}

}
