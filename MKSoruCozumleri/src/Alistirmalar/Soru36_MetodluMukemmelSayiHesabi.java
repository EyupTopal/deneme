package Alistirmalar;

// Kendisi disindaki bölenlerinin toplami kendine esit olan 28in mükemmel sayi oldugunu kanitlayin
public class Soru36_MetodluMukemmelSayiHesabi {
    public static void main(String[] args) {
        mukemmelSayi (28);
    }

    public static void mukemmelSayi(int s1) {

        int toplam = 0;
        for (int i = 1; i < s1; i++) {
            if (s1 % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == s1) {
            System.out.println ("Mükemmel Sayidir");
        } else {
            System.out.println ("Mükemmel Sayi Degildir");
        }
    }
}
