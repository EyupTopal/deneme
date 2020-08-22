package Alistirmalar;
// yaricapi girilen dairenin alani ve cevresini hesaplayan kod
import java.util.Scanner;

public class Soru44_MetodluDaireAlanveCevre {
    public static void main(String[] args) {
        System.out.println ("dairenin yari capini giriniz");
        Scanner scn = new Scanner (System.in);
        double yariCap = scn.nextInt ();
        double pi=3.14;

        daireAlan (yariCap,pi);
        daireCevre (yariCap,pi);
    }

    public static void daireAlan(double yariCap, double piSayisi){
       double daireAlan=(yariCap*yariCap*piSayisi);
        System.out.println ("yari capi = "+ yariCap+ " olan dairenin alani = "+ daireAlan );
    }
    public static void daireCevre(double yariCap, double piSayisi){
        double daireCevre=yariCap*2* piSayisi;
        System.out.println ("yari capi = "+ yariCap+ " olan dairenin cevresi = "+ daireCevre );
    }
}
