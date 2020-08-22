import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        String isim=sc.next ();
        Muhendis muh=new Muhendis (isim);
       muh.isimYaz ();
       muh.toString ();
    }
}
