package Alistirmalar;

import java.util.Scanner;

// Disardan girilen sayilarla diktörtgenin cevre ve alanini hesaplayan formül
public class Soru35_MetodluDikdortgenCevreveAlani {
    public static void main(String[] args) {
        System.out.println ("Uzun Kenari giriniz");
        Scanner scn = new Scanner (System.in);
        int uzunKenar = scn.nextInt ();

        System.out.println ("Kisa Kenari giriniz");
        Scanner scn2 = new Scanner (System.in);
        int kisaKenar = scn2.nextInt ();
        diktortgenAlan (kisaKenar,uzunKenar);
        diktortgenCevre (kisaKenar,uzunKenar);
    }

    public static void diktortgenAlan(int kisaKenar, int uzunKenar){
        int diktortgenAlan=(kisaKenar*uzunKenar);
        System.out.println ("Kisa kenari = "+ kisaKenar+ " , uzun kenari = "+ uzunKenar+ " olan diktörtgenin alani = "+ diktortgenAlan );
    }
    public static void diktortgenCevre(int kisaKenar, int uzunKenar){
        int diktortgenCevre=(uzunKenar+kisaKenar)*2;
        System.out.println ("Kisa kenari = "+ kisaKenar+ " , uzun kenari = "+ uzunKenar+ " olan diktörtgenin cevresi= "+diktortgenCevre);
    }
}
