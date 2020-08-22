package Ornekler;
import java.util.Arrays;
import java.util.Scanner;
public class Soru2 {

    public static void main (String []args) {
        int dizi[] = new int[10];
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner (System.in);
            int sayi = sc.nextInt ();
            dizi[i] = sayi;
        }
        String text = Arrays.toString (dizi);
        System.out.println (text);
        Soru2 nesne=new Soru2 ();
        nesne.sirala (dizi,text);
    }
     public void sirala(int[] dizi, String diziText){
     for (int i=0; i<dizi.length; i++){
        for(int k=0;k<dizi.length-1; k++){
            if (dizi[k]>dizi[k+1]){
            int gecici=dizi[k+1];
            dizi[k+1]=dizi[k];
            dizi[k]=gecici;
             }
        }
    }
        diziText=Arrays.toString (dizi);
        System.out.println (diziText); }


}
