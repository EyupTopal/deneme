package DiziMetodlari;

import java.util.Arrays;
import java.util.Random;

public class ContainsMetodu {
    public static void main (String[]args) {
    Integer[] dizi  =new Integer[20];
    for (int i=0; i<dizi.length; i++){
        Random rnd=new Random ();
        int sayi=rnd.nextInt (100)+1;
        dizi[i]=sayi; }
        System.out.println ( Arrays.asList (dizi));
        System.out.println (Arrays.asList (dizi).contains (5));
        System.out.println ("-------------------------------");
        String []dizi2= new String[3];
        dizi2[0]="Kapsamli";
        dizi2[1]="java" ;
        dizi2[2]="Egitimi";
    String diziText=Arrays.toString (dizi2);
        System.out.println (diziText);
        boolean result=Arrays.asList (dizi2).contains ("Kapsamli");
        System.out.println (result);

        System.out.println ("///////////////////");
    Double[]dizi3=new Double[3];
        dizi3[0]=2D;
        dizi3[1]=22D;
        dizi3[2]=32D;
        System.out.println (Arrays.asList (dizi3).contains (2D));
        System.out.println ("+++++++++++++++++++++++++++++++++++");

    }

    }

