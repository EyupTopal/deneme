package DiziMetodlari;

import java.util.Arrays;
import java.util.Random;

public class toString {
    public static void main (String[]args){
        int []sayilar=new int[10];
        for (int i=0; i<sayilar.length; i++){
            Random rnd=new Random ();
            int sayi=rnd.nextInt (100)+1;
            sayilar[i]=sayi; }
        String sayilarText= Arrays.toString (sayilar);
        System.out.println (sayilarText);

    Arrays.sort (sayilar);
        System.out.println ("------------------------");
        sayilarText= Arrays.toString (sayilar);
        System.out.println (sayilarText);
    }

}
