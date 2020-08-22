package Ornek1;

public class Ogretmen extends CalisanInsan{
    private int maas;
    private int vergi;

    public Ogretmen(int maas){
        this.maas=maas;
    }

    @Override
    public void maasHesabi() {
        maas=maas-vergi;
        System.out.println ("Maas= "+maas);
    }

    @Override
    public void vergiOde() {
        vergi=maas*30/100;
        System.out.println ("Odenen Vergi= "+ vergi);
    }
}
