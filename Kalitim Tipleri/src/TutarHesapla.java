package SingleKalitimYapisi;

public class TutarHesapla {

    public String urunIsmi;
    public int urunFiyati;
    public int urunAdet;
    public double kdvOran;
    public double tutar;
}

public TutarHesapla(String urunIsmi, int urunFiyati, int urunAdet, double kdvOran, double tutar){
    this.urunIsmi=urunIsmi;
    this.urunFiyati=urunFiyati;
    this.urunAdet=urunAdet;
    this.kdvOran=kdvOran;
    this.tutar=tutar;
}

public void fiyatHesabi(){
    tutar=Double.valueOf (urunAdet*urunFiyati)+(urunFiyati*urunAdet*kdvOran);
}

public void fisYaz(){
    System.out.println (urunIsmi" isimli üründen " + urunAdet + " adet alinmistir. Ödenecek tutar "+ tutar );
}