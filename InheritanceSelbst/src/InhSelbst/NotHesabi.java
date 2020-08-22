//package InhSelbst;
//
//import java.util.Scanner;
//
//public class NotHesabi {
//
//        System.out.println ("sinif mevcudunu girin=");
//        Scanner scn = new Scanner (System.in);
//        int sinifMevcut = scn.nextInt ();
//
//        int toplamPuan = 0;
//        for (int i = 1; i <= sinifMevcut; i++) {
//            System.out.println (i + "nci ögrencinin notunu gir");
//            Scanner scn2 = new Scanner (System.in);
//            int ogrenciNot = scn2.nextInt ();
//            toplamPuan = toplamPuan + ogrenciNot;
//        }
//        double ortalamaPuan = ortalamaPuan (sinifMevcut, toplamPuan);
//        String degerlendirme = basariDegerlendirme (ortalamaPuan);
//        System.out.println ("B4 Sinifinin Ortalama Puani= "+ ortalamaPuan);
//        System.out.println (degerlendirme);
//    }
//
//    public static double ortalamaPuan(int sinifMevcut, int toplamPuan) {
//        double puan = (double) toplamPuan;
//        double mevcut = (double) sinifMevcut;
//        double ortalamaPuan = puan / mevcut;
//        return ortalamaPuan;
//    }
//
//    public static String basariDegerlendirme(double ortalamaPuan) {
//        String durum = "";
//        if (ortalamaPuan <= 100 && ortalamaPuan > 75) {
//            durum = "Üstün zekali sinif";
//            return durum;
//        } else if (ortalamaPuan <= 74 && ortalamaPuan > 70) {
//            durum = " basarili";
//            return durum;
//        } else if (ortalamaPuan <= 69 && ortalamaPuan > 60) {
//            durum = "orta";
//            return durum;
//        } else {
//            durum = " zayif";
//            return durum;
//        }
//    }
//}
