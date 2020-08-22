package Alistirmalar;
// Bir firmanin degeri 2014 yilinda 60.000 Tl iken her yil %21 deger artisi ile kac yilda degeri 900.000Tl
// olur ve biz o zaman hangi yilda oluruz.

public class Soru28_MetodluFirmaDegeri {
    public static void main(String[] args) {
        guncelDeger (0);
    }

    public static void guncelDeger(int sene) {
        int yil = 2014;
        int deger = 600000;
        int hedef = 900000;
        while (deger <= hedef) {
            deger = deger + ((deger * 21) / 100);
            yil = yil + 1;
            sene = sene + 1;
            System.out.println ("Güncel Deger = " + deger);
        }

        System.out.println ("Yil " + yil);
        System.out.println ("Hedefe Kac senede Ulasti = " + sene);
        System.out.println ("Güncel Deger = " + deger);
    }
}
