package Alistirmalar;

// 50 ye kadar olan asal sayilarin toplamini hesaplayan kod?
public class Soru3_AsalSayiToplam {
    public static void main(String[] args) {
        int sayi = 2;//en kücük asal sayi
        int asalSayiToplam = 0;
        int toplam = 0;
        while (sayi <= 50) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam = toplam + 1;
                }
            }
            if (toplam == 0) {
                asalSayiToplam = asalSayiToplam + sayi;
            }
            toplam = 0;
            sayi = sayi + 1;
        }
        System.out.println (asalSayiToplam);
    }
}


