package Alistirmalar;

//1-1-2-3-5-8-13-21 ciktisini --iki int degeri-- üzerinden gerceklestiren java kodunu yaziniz?
public class Soru7_Atlamali_Siralama {
    public static void main(String[] args) {
        int sayi1 = 1;
        int sayi2 = 1;
        System.out.print (sayi1+"-"+sayi2);
        while (sayi2 <= 21) {
            int sayi3=sayi2;
            sayi2 = sayi1 + sayi2;
            sayi1 = sayi3;
            System.out.print ("-" + sayi2);
        }
    }
}