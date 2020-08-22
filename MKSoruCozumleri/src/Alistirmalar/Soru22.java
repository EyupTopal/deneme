package Alistirmalar;
import java.util.Scanner;

//Girilen sayi 6nin kati ise girilen sayi kadar konsola "kapsamli java egitimi" ciktisi veren kod?
public class Soru22 {
    public static void main(String[] args) {
        System.out.println ("Lütfen sayi giriniz");
        Scanner scn = new Scanner (System.in);
        int s1 = scn.nextInt ();

        if (s1%6==0){
            for (int i=1; i<=s1; i++){
                System.out.println (i + " Kapsamli java egitimi" );
            }
        }


    }
}
