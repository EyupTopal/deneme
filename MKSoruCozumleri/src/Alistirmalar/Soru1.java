package Alistirmalar;

//10 dan 40 kadar 3 ve 5 in katlarini toplayan kod?
public class Soru1 {
    public static void main(String[] args) {
        int toplam = 0;
        for (int x = 10; x <= 40; x++) {
            if (x % 3 == 0 || x % 5 == 0) {
                toplam = toplam + x;
            }
        }
        System.out.println (toplam);
    }
}
