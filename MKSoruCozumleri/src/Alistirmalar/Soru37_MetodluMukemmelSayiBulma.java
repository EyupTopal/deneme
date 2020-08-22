package Alistirmalar;

public class Soru37_MetodluMukemmelSayiBulma {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            mukemmelSayi (i);
        }
    }

    public static void mukemmelSayi(int s1) {

        int toplam = 0;
        for (int i = 1; i < s1; i++) {
            if (s1 % i == 0) {
                toplam = toplam + i;
            }
        }
        if (toplam == s1) {
            System.out.println (s1);
        }
    }
}