package CompositionWohnzimmer;

public class Sofa {
    private String farbe;
    private int kapacite;
    private String type;

    public Sofa(String farbe, int kapacite, String type) {
        this.farbe = farbe;
        this.kapacite = kapacite;
        this.type = type;
    }

    public void sitzen() {
        System.out.println ("Sofaya oturuldu.");
    }

    public void putzen() {
        System.out.println ("Sofa temizlendi");
    }

    public String getFarbe() {
        return farbe;
    }

    public int getKapacite() {
        return kapacite;
    }

    public String getType() {
        return type;
    }
}
