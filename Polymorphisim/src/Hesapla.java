public class Hesapla {
    public void topla(int sayi1, int sayi2){
        System.out.println ("Int Toplam = "+ (sayi1+sayi2));
    }
    public void topla(String sayi1, String  sayi2){
        int s1= Integer.parseInt (sayi1);
        int s2=Integer.parseInt (sayi2);
        System.out.println ("String Toplam= "+ (s1+s2));
    }
}
