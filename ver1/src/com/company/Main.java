package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // switch case with months to seasons
        // showSeason();
        // increment decrement
        //incDec();
        //loops();
        // calculateFactorial();
        // loopsExtended();
        forLoop();
        //calculateFactorialWithForLoop();
        // forLoopExample();
        // nestedLoop();
        // intro to arrays
    }private static void forLoop() {
        int sum=0;
       for(int i=0;i<=10;i++)
       for (int j=0; j<10; j++){
            System.out.println("number is now: "+i+j);
            sum +=i;
            sum +=j;// sum= sum +i;
        }
        System.out.println("sum is :"+sum);
    }}








