package Sinav2;

import java.util.Scanner;

public class Frage1 {
    public static void main(String[] args) {
        System.out.println ("Please enter the staying time");
        Scanner scn = new Scanner (System.in);
        int time = scn.nextInt ();

        double total = 0;
        if (time <= 1) {
            System.out.println ("It is free");
        } else if (time > 1 && time <= 3) {
            total = time * 5;
            System.out.println ("you should pay = "+ total+ " Euro");
        } else if (time > 3 && time <= 5) {
            total = time * 3;
            System.out.println ("you should pay = "+total+ " Euro");
        } else if (time > 5 && time <= 10) {
            total = time * 2;
            System.out.println ("you should pay = "+total+ " Euro");
        } else {
            total = time * 0.5;
            System.out.println ("you should pay = "+total+ " Euro");
        }

    }
}
