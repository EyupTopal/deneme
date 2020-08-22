package Alistirmalar;

import java.util.Random;

//Kullanici bes kere cark cevirsin. Her cevirmede 1 ile 10 arasinda sayi olustursun. 1-3-5 disindaki tüm
//sayilar 10 ile carpilip puana eklensin. 1-3-5 gelinnce iflas etsin.En sonunda puani göstersin
public class Soru49_CarkOyunu {
    public static void main(String[] args) {
        int toplam=0;
        for (int i=1; i<=5; i++){
            System.out.println (" Lutfen cark cevirin");
            Random rnd= new Random ();
            int sayi=rnd.nextInt (10)+1;
            System.out.println ("sayi "+ sayi);

            if (sayi==1||sayi==3||sayi==5){
                System.out.println (" IFLAS");
                return ;
            }else {
                sayi=sayi*10;
                toplam=toplam+sayi;
            } System.out.println (sayi);
        }


        System.out.println ("toplam = " + toplam);
    }
}
