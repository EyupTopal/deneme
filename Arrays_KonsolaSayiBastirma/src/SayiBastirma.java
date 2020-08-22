public class SayiBastirma {
    public static void main (String []args){
        int sayilar []=new int[5];
        sayilar[0]=44;
        sayilar[1]=55;
        sayilar[4]=85;
        sayilar[2]=4;
        System.out.println ("Dizinin Boyutu = "+ sayilar.length);
        for (int i=0; i<=sayilar.length; i++){
            System.out.println (sayilar[i]);
        }
    }
}
