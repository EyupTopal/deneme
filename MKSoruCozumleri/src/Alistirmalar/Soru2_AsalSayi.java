package Alistirmalar;

//20ye kadar olan asal sayilari bulan kod?
public class Soru2_AsalSayi {
    public static void main(String[] args) {
        int sayi = 2;//en kücük asal sayi
        int toplam = 0;
        while (sayi <= 20) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam = toplam + 1;
                }
            }
            if (toplam == 0) {
                System.out.println (sayi);
            }
            toplam = 0;
            sayi = sayi + 1;
        }
    }

}
