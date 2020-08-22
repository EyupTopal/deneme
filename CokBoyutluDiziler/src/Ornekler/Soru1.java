package Ornekler;

import java.util.Random;

public class Soru1 {
    public static void main (String []args){
        //0-Mat, 1- Türkce, 2- Fen;
        int [][]sinifNotlari=new int[40][3];
        for (int i=0; i<40; i++){
            for (int k=0; k<3; k++){
                Random rnd=new Random ();
                int not=rnd.nextInt (100)+1;

                sinifNotlari[i][k]=not;
            }
        }
        int ort=0;
        int indis=0;
        int buyuk=0;

        for (int i=0; i<40; i++){
            for (int k=0; k<3; k++) {
                String dersIsmi = " ";
                if (k == 0) {
                    dersIsmi = "Matematik";
                }
                if (k == 1) {
                    dersIsmi = " Türkce ";
                } else {
                    dersIsmi = "Fen";
                }
                System.out.println ((i + 1) + " nci ögrencinin " + dersIsmi + " notu = " + sinifNotlari[i][k]);

                ort = ort + sinifNotlari[i][k];
            }
            ort=ort/3;
            if (ort>buyuk){
                buyuk=ort;
                indis=i+1;
            }
            ort=0;
             }
        System.out.println ("En basarili  ögrenci "+ indis);
        System.out.println ("En Yüksek Ortalama "+ buyuk);
            }

            }
