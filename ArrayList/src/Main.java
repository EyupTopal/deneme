import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Costumer> costumers=new ArrayList<> ();
        costumers.add (new Costumer (1,"Eyüp", "Topaloglu"));
        costumers.add (new Costumer (2,"Leman", "Topaloglu"));
        costumers.add (new Costumer (3, "Hakan", "Topaloglu"));
        costumers.add (new Costumer (4,"Özlem", "Topaloglu"));

        for(Costumer costumer:costumers){
            System.out.println (costumer.getId ()+" : "+costumer.getFirstName ()+"  "+costumer.getLastName ());
        }
    }
}
