package Ornek1;

public class Muhendis extends CalisanInsan{
    private int maas;
    private int vergi;

    public Muhendis(int maas){
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
    public void belgeNo(){
        System.out.println ("0000");
    }
}
