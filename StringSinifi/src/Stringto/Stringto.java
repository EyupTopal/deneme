package Stringto;

public class Stringto {
    public static void main(String[] args) {
        String metin="  Bizbiz idik biz idik otuz iki kiz idik.";
        System.out.println (metin.length ());

        char charDeger=metin.charAt (38);
        System.out.println (charDeger);

        System.out.println (metin.substring (5,25));
       String metin2= metin.concat (", otuz iki kiz idik.  ");
        System.out.println (metin2.length ());
        System.out.println ("------------");
        int indexOf=metin2.indexOf ("k");
        System.out.println (indexOf);
        int indexof2=metin2.lastIndexOf ("B");
        System.out.println (indexof2);
        String metin3= metin2.trim ();
        System.out.println (metin3+ metin3.length ());
        System.out.println (metin.toUpperCase ());
        System.out.println (metin2.toLowerCase ());

    }
}
