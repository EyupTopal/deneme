package DiziMetodlari;

import java.util.Arrays;
import java.util.Random;

public class IndexOf {
    public static void main (String[]args) {
        Integer[] dizi  =new Integer[10];
        for (int i=0; i<dizi.length; i++){
            Random rnd=new Random ();
            int sayi=rnd.nextInt (100)+1;
            dizi[i]=sayi; }
        String diziText=Arrays.toString (dizi);
        System.out.println (diziText);
        int result= Arrays.asList (dizi).indexOf (3);
        System.out.println (result);
        System.out.println ("///////////////////////////");
        String[]dizi2= new String[5];
        dizi2[0]="m";
        dizi2[1]="u";
        dizi2[2]="r";
        dizi2[3]="a";
        dizi2[4]="t";
       diziText=Arrays.toString (dizi2);
        System.out.println (diziText);
        result=Arrays.asList (dizi2).indexOf ("ü");
        System.out.println (result);


    }}
