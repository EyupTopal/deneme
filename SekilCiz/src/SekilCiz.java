import static java.lang.System.out;

public class SekilCiz {
    public int sekilTipi;
    public SekilCiz(int sekilTipi){
    this.sekilTipi=sekilTipi;
    }

    public void ciz(){
        if (sekilTipi==1){
            kareCiz (5);
        }else if (sekilTipi==2){
            normalUcgenCiz (5);
        }else {
            out.println ("Birsey Cizemiyorum");
        }
    }
    public static void kareCiz(int boyut){
        for (int i=1; i<=boyut; i++){
            out.println (" ");
        for (int k=1; k<=boyut;k++){
            out.print ("*");
        }
        }
    }
    public static void normalUcgenCiz(int boyut)
    {
        for(int i=1;i<=boyut; i++)
        {
            for (int x=boyut; x>=i; x--)
            {
                System.out.print ("");
            }
            for (int k=1; k<=i; k++){
                System.out.print ("*");
            }
            for (int k=1; k<=i; k++){
                System.out.print ("*");
            }
            System.out.println ();
        }
    }
}
