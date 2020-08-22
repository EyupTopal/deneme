package InhSelbst;

public class DeutschOgretmen extends DeutschDept {
    private String name;
    private int maas;
    private double tel;

        public DeutschOgretmen (String name, int maas, double tel){
            this.maas=maas;
            this.name=name;
            this.tel=tel;
        }
        public DeutschOgretmen(){
            this("Ali", 1000, 25487);
            System.out.println ("name= "+ name+ "   maas= "+ maas+ "  tel=  "+ tel);

        }

}
