package CompositionWohnzimmer;

public class Fernsehen {
    private String farbe;
    private int boyut;
    private int agirlik;
    private String marka;

    public Fernsehen(String farbe, int boyut, int agirlik, String marka) {
        this.farbe = farbe;
        this.boyut = boyut;
        this.agirlik = agirlik;
        this.marka = marka;
    }

    public void filmizle() {
        System.out.println ("Film izlendi.");
    }

    public void belgeselIzle() {
        System.out.println ("Belgesel izlendi");
    }

    public void macSeyret() {
        System.out.println ("Mac izlendi");
    }

    public String getFarbe() {
        return farbe;
    }

    public int getBoyut() {
        return boyut;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public String getMarka() {
        return marka;
    }
}

