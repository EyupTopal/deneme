package CompositionWohnzimmer;

public class Tisch {
    private String tischFarbe;
    private int tischEn;
    private int tischBoy;
    private int StuhlAdet;

    public Tisch(String tischFarbe, int tischEn, int tischBoy, int stuhlAdet) {
        this.tischFarbe = tischFarbe;
        this.tischEn = tischEn;
        this.tischBoy = tischBoy;
        StuhlAdet = stuhlAdet;
    }

    public void yaziYaz() {
        System.out.println ("Yazi yazildi");
    }

    public void resimYap() {
        System.out.println ("resim yapildi.");
    }

    public String getTischFarbe() {
        return tischFarbe;
    }

    public int getTischEn() {
        return tischEn;
    }

    public int getTischBoy() {
        return tischBoy;
    }

    public int getStuhlAdet() {
        return StuhlAdet;
    }
}
