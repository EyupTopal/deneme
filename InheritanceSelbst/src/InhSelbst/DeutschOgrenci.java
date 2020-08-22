package InhSelbst;

public class DeutschOgrenci extends DeutschDept {
    private String name;
    private int id;
    private int not;
    private double tel;

    public DeutschOgrenci(String name, int id, int not, double tel) {
        this.id = id;
        this.name = name;
        this.not = not;
        this.tel = tel;

    }
    public DeutschOgrenci(){
        this("ahmet", 5487, 25, 2548788);
        System.out.println ("name = "+ name+"  Id =  " +id+"Not ort=  "+ not+"Tel Nu=  "+ tel);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public double getTel() {
        return tel;
    }

    public void setTel(double tel) {
        this.tel = tel;
    }
}
