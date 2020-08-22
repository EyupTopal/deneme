import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<> ();
        isimler.add ("Ali");
        isimler.add ("Veli");
        isimler.add ("Tamer");
        isimler.add ("Erdo");
        isimler.add ("basar");

        System.out.println ("isimler = " + isimler);

        ArrayList<String> isimler2 = new ArrayList<> ();
        isimler2.add ("Rabia");
        isimler2.add ("Güllü");
        isimler.addAll (isimler2);
        System.out.println ("isimler = " + isimler);
        isimler.addAll (isimler);
        System.out.println ("isimler = " + isimler);
        System.out.println ("isimler2 = " + isimler.size ());
        System.out.println ("isimler.remove (3) = " + isimler.remove (3));
        System.out.println ("isimler = " + isimler);
        System.out.println ("isimler.size () = " + isimler.size ());
        System.out.println ("isimler.get (5) = " + isimler.get (5));

        Iterator<String> iterator = isimler.iterator ();
        while (iterator.hasNext ()) {
            System.out.println ("iterator.next () = " + iterator.next ());
        }

        for (int i = 0; i < isimler.size (); i++) {
            System.out.println (isimler.get (i));
        }
ArrayList<Integer>sayilar=new ArrayList<> ();
        sayilar.add (5);
        sayilar.add (10);
        sayilar.add (15);
        for (int i=0; i<sayilar.size (); i++){
            System.out.println (sayilar.get (i)*5);
        }
    }
}
