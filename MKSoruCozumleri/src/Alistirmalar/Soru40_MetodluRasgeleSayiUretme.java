package Alistirmalar;
// Random sayi olusturma
import java.util.Random;

public class Soru40_MetodluRasgeleSayiUretme {
    public static void main(String[] args) {
        Random rn=new Random ();
        int sayi=rn.nextInt (1000);
        System.out.println (sayi);
    }
}
