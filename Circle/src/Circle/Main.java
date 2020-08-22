package Circle;

public class Main {
    public static void main(String[] args) {
Circle circle=new Circle (10);
        System.out.println ("circle.getRadius () = " + circle.getRadius ());
        System.out.println ("circle.getRadius () = " + circle.getRadius ());
        
        Cylinder cylinder=new Cylinder (10,10);
        System.out.println ("cylinder.getRadius () = " + cylinder.getRadius ());
        System.out.println ("cylinder.getArea () = " + cylinder.getArea ());
        System.out.println ("cylinder.getVolume () = " + cylinder.getVolume ());

    }
}
