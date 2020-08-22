package Single;

public class TutarHesapla {
    public String urunIsmi;
    public int urunFiyat;
    public int urunAdet;
    public double kdv;
    public double tutar;

public TutarHesapla(String urunIsmi, int urunFiyat, int urunAdet, double kdv){
    this.urunAdet=urunAdet;
    this.kdv=kdv;
    this.urunFiyat=urunFiyat;
     this.urunIsmi=urunIsmi;
}
public void fiyatHesapla(){
    tutar= Double.valueOf (urunAdet*urunFiyat)+(urunFiyat*urunAdet*kdv);
    }
public void fisYaz(){
    System.out.println (urunIsmi+"  isimli üründen  "+ urunAdet+" adet satin alinmistir. Fiyati  "+ tutar+" dir");
}}