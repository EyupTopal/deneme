package DiziKlonlama;

import java.util.Arrays;
import java.util.Random;

public class DiziKlonlama {
    public static void main (String []args){
        int []sayilar=new int[100];
        for (int i=0; i<sayilar.length; i++){
            Random rnd=new Random ();
            int sayi=rnd.nextInt (1000)+100;
            sayilar[i]=sayi;
        }
        String diziText= Arrays.toString (sayilar);
        System.out.println (diziText);
        int[]cloneDizi=sayilar.clone ();
        diziText=Arrays.toString (cloneDizi);
        System.out.println (diziText);
        System.out.println (sayilar[5]==cloneDizi[5]);
        System.out.println (sayilar[22]==cloneDizi[22]);
        System.out.println (sayilar[51]==cloneDizi[51]);
        System.out.println (sayilar==cloneDizi);}
    }

