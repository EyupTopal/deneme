package com.bca;

/*
 * Ali
 * Eyüp D
 * Fethi
 * Murat
  /
*
 */


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println ("Hallo");
        System.out.println ("isPerfectNumber(-2) = " + isPerfectNumber (-2));
        System.out.println ("isPerfectNumber(5) = " + isPerfectNumber (5));
        System.out.println ("isPerfectNumber(6) = " + isPerfectNumber (6));
        System.out.println ("isPerfectNumber(28) = " + isPerfectNumber (28));
        System.out.println ("isPerfectNumber(30) = " + isPerfectNumber (30));
    }

    //Write a method named isPerfectNumber with one parameter of type int named number.
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                total = total + i;
        }
        if (total == number) {
            return true;
        } else {
            return false;
        }
    }
}





