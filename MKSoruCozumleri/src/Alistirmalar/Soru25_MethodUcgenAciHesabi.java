package Alistirmalar;

import java.util.Scanner;

// Bir ücgenin iki acisini disaridan girip diger acisini bulan metod?
public class Soru25_MethodUcgenAciHesabi {
    public static void main(String[] args) {
        System.out.println ("Ilk Acisini giriniz");
        Scanner scn = new Scanner (System.in);
        int aci1 = scn.nextInt ();

        System.out.println ("Ikinci Acisini giriniz");
        Scanner scn2 = new Scanner (System.in);
        int aci2 = scn2.nextInt ();
        ucgenAci (aci1, aci2);
    }

    public static void ucgenAci(int aci1, int aci2) {
        int aci = 180 - (aci1 + aci2);
        System.out.println ("Ücgenin ücüncü kenarinin acisi = "+ aci);
    }
}
