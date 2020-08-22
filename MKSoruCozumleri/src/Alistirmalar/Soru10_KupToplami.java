package Alistirmalar;

// 1den 15e kadar olan sayilarin küplerinin toplamini bulan kod?
public class Soru10_KupToplami {
    public static void main(String[] args) {

        int toplam = 0;
        for (int i = 1; i <= 15; i++) {
            int kup = i * i * i;
            toplam = toplam + kup;
        }
        System.out.println ("Toplam = " + toplam);
    }
}
