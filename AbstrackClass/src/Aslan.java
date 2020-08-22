public class Aslan extends Hayvan {
    public Aslan(String renk){
        super(renk);
    }
    @Override
    void bacakSayisi(int sayi) {
        System.out.println ("Bacak sayisi = "+ sayi);
    }
}
