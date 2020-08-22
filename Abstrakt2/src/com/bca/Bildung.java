package com.bca;

import java.util.Scanner;

public abstract class Bildung {
    abstract void hesapla();

    public void notHesabi() {
        int vize = 100;
        int finall = 90;
        int proje = 100;
        int not = 0;
        not = (((vize * 35) + (finall * 50) + (proje * 15)) / 100);
        System.out.println ("Ögrenci Notu = " + not);

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
    public void ortalamaSayiBulma(){
        double topla = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println (i + " nci sayiyi giriniz");
            Scanner scn = new Scanner (System.in);
            double sayi = scn.nextInt ();
            topla = topla + sayi;
        }
        double ort = (double) (topla / 10);
        System.out.println ("Girilen sayilarin ortalamasi= " + ort);
    }
    }
}