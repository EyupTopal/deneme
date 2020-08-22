package Ornek2;

public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI ();
        krediUI.krediHesapla (new OgretmenKrediManager ());
        System.out.println ("krediUI = " + krediUI);
    }
}
