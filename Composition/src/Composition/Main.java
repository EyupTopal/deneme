package Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions (20, 20, 5);
        Case theCase = new Case ("220B", "dell", "240", dimensions);

    Monitor theMonitor=new Monitor ("27 inch Beast", "Acer", 27,new Resolution (2540, 1440));

    MotorBoard theMotorBoard= new MotorBoard ("Bj 200", "Asus", 4,6,"v2.400");
    PC thePC =new PC (theCase, theMonitor,theMotorBoard);
   thePC.powerUp ();

    }
}
