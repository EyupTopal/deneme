public class Ogrenci {
    private String ogrenciAdi;
    private String ogrenciSoyadi;
    private int ogrenciNo;

    public int getOgrenciNo() {
    return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    private int ogrenciSinif;

    public int getOgrenciSinif() {
        return ogrenciSinif;
    }

    public String getOgrenciSoyadi() {
        return ogrenciSoyadi;
    }

    public void setOgrenciSoyadi(String ogrenciSoyadi) {
        this.ogrenciSoyadi = ogrenciSoyadi;
    }

    public void setOgrenciSinif(int ogrenciSinif) {
        this.ogrenciSinif = ogrenciSinif;
    }

    public String getOgrenciAdi() {
        return ogrenciAdi;
    }

    public void setOgrenciAdi(String ogrenciAdi) {
        this.ogrenciAdi = ogrenciAdi;
    }

    public Ogrenci(String ogrenciAdi, String ogrenciSoyadi, int ogrenciNo, int ogrenciSinif){
    this.ogrenciAdi=ogrenciAdi;
    this.ogrenciSoyadi=ogrenciSoyadi;
    this.ogrenciNo=ogrenciNo;
    this.ogrenciSinif=ogrenciSinif;
}



    }
