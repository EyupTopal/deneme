package Sinav2;

import java.util.Scanner;

public class Frage6 {
    public static void main(String[] args) {
        System.out.println ("Please enter hand baggage");
        Scanner scn1=new Scanner (System.in);
        int hand=scn1.nextInt ();

        System.out.println ("Please enter normal baggage");
        Scanner scn2=new Scanner (System.in);
        int normal=scn2.nextInt ();

        int total=0;
        int totalhand = 0;
        int totalnormal = 0;
        if (hand > 8) {
            totalhand = (hand - 8) * 10;
        } else {
            totalhand = 0;
        }
        if (normal > 20) {
            totalnormal = (normal - 20) * 5;
        } else {
            totalnormal = 0;
        }
        total=totalhand+totalnormal;
        System.out.println ("You must pay = "+ total+ " Euro ");
    }
}
