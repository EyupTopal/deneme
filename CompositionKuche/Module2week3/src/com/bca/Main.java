import com.bca.Boden;
import com.bca.Esstisch;
import com.bca.Kueche;
import com.bca.Kuehlschrank;

public class Main {

    public static void main(String[] args) {

        // strg+alt+v --> von ausgewählten einen lokalen Variable erstellen

        Boden boden1 = new Boden ("grau", 3, 5);
        Esstisch esstisch1 = new Esstisch ("weiss", 4);
        Kuehlschrank kuehlschrank1 = new Kuehlschrank ("weiss", "samsung");
        Kueche kueche1 = new Kueche (esstisch1, boden1, kuehlschrank1);

        kueche1.essenInDerKueche ();

    }

}





