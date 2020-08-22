package DiziMetodlari;
import java.util.Arrays;
import java.util.Random;

public class SortMetodu {

    public static void main (String[]args){

    int []sayilar=new int[10];
        for (int i=0; i<sayilar.length; i++){
        Random rnd=new Random ();
        int sayi=rnd.nextInt (100)+1;
        sayilar[i]=sayi; }

        SortMetodu nesne=new SortMetodu ();
        nesne.ciktiVer (sayilar);

        Arrays.sort (sayilar);

        System.out.println ("----------------------");
        nesne.ciktiVer (sayilar);
}
    public void ciktiVer(int[] dizi) {
    for (int i = 0; i < dizi.length; i++) {
        System.out.println (dizi[i]);
     }
}}
