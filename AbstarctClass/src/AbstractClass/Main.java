package AbstractClass;

public class Main {
    public static void main(String[] args) {
        GameCalculator gameCalculator=new ManGameCalculator ();
        gameCalculator.gameOver ();
        gameCalculator.hesapla ();
        System.out.println ("---------------------");
        KidsGameCalculator kidsGameCalculator=new KidsGameCalculator ();
        kidsGameCalculator.hesapla ();
        kidsGameCalculator.gameOver ();

        ManGameCalculator manGameCalculator=new ManGameCalculator ();
        manGameCalculator.hesapla ();
        manGameCalculator.gameOver ();


        WomenGameCalculator womenGameCalculator=new WomenGameCalculator ();
        womenGameCalculator.hesapla ();
        womenGameCalculator.gameOver ();
        OlderGameCalculator olderGameCalculator=new OlderGameCalculator ();
        olderGameCalculator.hesapla ();
        olderGameCalculator.gameOver ();

  }
}

