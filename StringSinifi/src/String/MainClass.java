package String;

public class MainClass {
    public static void main (String []args){
        String metin="Ben bir ceviz agaciyim Gülhane Parkinda, ";
        System.out.println (metin);
        int karakterSayisi=metin.length ();
        System.out.println (karakterSayisi);
        char karakter=metin.charAt (8);
        System.out.println (karakter);
        String subString1=metin.substring (10);
        System.out.println (subString1);
        String subString2=metin.substring (4,24);
        System.out.println (subString2);
        String metinEkle=metin.concat ("Ne sen bunun farkindasin ne de polis farkinda");
        System.out.println (metinEkle);
        int indexFharfi=metinEkle.indexOf ("e");
        System.out.println (indexFharfi);
        int indexNharfi=metinEkle.indexOf ("e");
        System.out.println (indexNharfi);
        int lastIndexOf=metinEkle.lastIndexOf ("B");
        System.out.println (lastIndexOf);
        String metin2="Ben bir ceviz agaciyim Gülhane Parkinda, ";
        Boolean sonuc=metin.equals (metin2);
        System.out.println (sonuc);
        System.out.println (metin.length ()+"--"+metin2.length ());
        String harf="a";
        String harf2="b";
        int comypareTo= harf.compareTo (harf2);
        System.out.println (comypareTo);

        int compareTo2=harf2.compareTo (harf);
        System.out.println (compareTo2);

        String kucukHarf=metinEkle.toLowerCase ();
        System.out.println (kucukHarf);

        String buyukHarf=metinEkle.toUpperCase ();
        System.out.println (buyukHarf);

        String replace=metinEkle.replace ("e","a");
        System.out.println (replace);

        String metin3="";
        Boolean bosmuDolumu=metin3.isEmpty ();
        System.out.println (bosmuDolumu);
        Boolean dolumuBosmu=metin2.isEmpty ();
        System.out.println (dolumuBosmu);

        String mailList="et@com.tr, ma@gmail.comm";
        String[] ayir=mailList.split (",");
        System.out.println (ayir[0]+"-----"+ayir[1]);

    }
}
