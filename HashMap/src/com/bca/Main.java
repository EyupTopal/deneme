package com.bca;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> sozluk=new HashMap<String ,String> ();
        sozluk.put ("Book", "Kitap");
        sozluk.put ("Cat", "Kedi");
        sozluk.put ("Dog","köpek");
        System.out.println (sozluk.get ("Cat"));
      //  System.out.println (sozluk);
    }
}
