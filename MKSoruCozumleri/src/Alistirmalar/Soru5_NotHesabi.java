package Alistirmalar;

// Bir ögrencinin vize notunun %35, final notunun %50, proje notunun %15 ini alarak notunu hesaplayan kod?
//(100-90 A; 89-80 BA; 79-70 BB; 69-50 CB; 49-45 CC; 45-40 , 40- FF)
public class Soru5_NotHesabi {
    public static void main(String[] args) {
        int vize = 100;
        int finall = 90;
        int proje = 100;
        int not = 0;
        not = (((vize * 35) + (finall * 50) + (proje * 15)) / 100);
        System.out.println ("Ögrenci Notu = "+ not);

        if (not <= 100 && not >= 90) {
            System.out.println ("Ögrenci Notu= A ");
        } else if (not <= 89 && not >= 80) {
            System.out.println ("Ögrenci Notu= BA ");
        } else if (not <= 79 && not >= 70) {
            System.out.println ("Ögrenci Notu= BB ");
        } else if (not <= 69 && not >= 50) {
            System.out.println ("Ögrenci Notu= CB ");
        } else if (not <= 49 && not >= 45) {
            System.out.println ("Ögrenci Notu= CC ");
        } else {
            System.out.println ("Ögrenci Notu= FF ");
        }
    }
}
