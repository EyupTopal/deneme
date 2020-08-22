package Sinav2;

import java.util.Scanner;

public class Frage3 {
    public static void main(String[] args) {
        System.out.println ("Please enter a positive intiger number");
        Scanner scn = new Scanner (System.in);
        int sayi = scn.nextInt ();
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.println (i);
            }
        }
    }
}
