package InhSelbst;

public class TanzOgrenci extends TanzDept {
    private String name;
    private int id;
    private int not;
    private double tel;

    public TanzOgrenci (String name, int id, int not, double tel){
        this.id = id;
        this.name = name;
        this.not = not;
        this.tel = tel;
    }

}
