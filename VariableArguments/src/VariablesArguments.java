public class VariablesArguments {

    public static void main(String[] args) {

        int toplam = topla (2,40,55,66,88);
        System.out.println ("Islemin toplami= " +toplam);
//        int topCikar = carp (88,44);
//        System.out.println ("Islemin toplami= " +toplam);
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;

    }
//    public static int carp(int... sayilar) {
//        int toplam = 0;
//        for (int sayi=1; sayi=sayilar; sayi++ ) {
//            toplam = sayi;
//        }
//        return toplam;
//
//    }
}
