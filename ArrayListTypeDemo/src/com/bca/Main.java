package com.bca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String> ();
        sehirler.add ("Malatya");
        sehirler.add ("Konya");
        sehirler.add ("Van");
        sehirler.add ("Mus");
        sehirler.add ("Aksaray");
        sehirler.add ("Zonguldak");
        Collections.sort (sehirler);
        for (String sehir : sehirler) {
            System.out.println (sehir);
        }

    }
}
