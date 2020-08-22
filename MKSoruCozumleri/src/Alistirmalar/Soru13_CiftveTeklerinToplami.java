package Alistirmalar;

import java.net.PortUnreachableException;
import java.util.Scanner;

// Disaridan girilen 20 sayidan ciftlerin ve teklerin toplamini bulan kod?
public class Soru13_CiftveTeklerinToplami {
    public static void main(String[] args) {
        int tektopla = 0;
        int cifttopla = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println (i + " nci sayiyi girin");
            Scanner scn = new Scanner (System.in);
            int sayi = scn.nextInt ();
            if (sayi % 2 == 0) {
                cifttopla = cifttopla + sayi;
            } else {
                tektopla = tektopla + sayi;
            }
            System.out.println (" cift sayilarin toplami = " + cifttopla);
            System.out.println ("tek sayilarin toplami = " + tektopla);
        }
    }
}
