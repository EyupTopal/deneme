package Alistirmalar;

import java.util.Scanner;

// k=x+y2 denkleminin sonucunu disaridan girilen x ve y degerleri icin hesaplayan kod?
public class Soru12_MethodluDenklem {
    public static void main(String[] args) {
        System.out.println ("x sayisini giriniz");
        Scanner scn1= new Scanner (System.in);
        int x =scn1.nextInt ();
        System.out.println ("y sayisini giriniz");
        Scanner scn2= new Scanner (System.in);
        int y =scn2.nextInt ();
        formul (x,y);
    }
    public static void formul(int x, int y){
        int k =x*y*y;
        System.out.println (k);
    }
}
