package Alistirmalar;

import java.util.Scanner;

// Klavyeden girilen 5 String ifadeyi konsola yanyana cikti basan kod
public class Soru29YanyanaStringBas {
    public static void main(String[] args) {
        String butun = "";
        for (int i = 1; i <= 5; i++) {
            System.out.println (i+". String ifadeyi giriniz");
            Scanner scn = new Scanner (System.in);
            String ifade = scn.nextLine ();
            butun = butun +"- "+ ifade;
        }
        System.out.println (butun);
    }
}
