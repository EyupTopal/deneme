package Exercises_If;

public class AreaCalculator {

    private static int YANLIS_PARAMETRE = -1;

    public static void main(String[] args) {
        double areaOfCircle = calculateArea (6);
        System.out.println ("Cemberin Alani = " + areaOfCircle);
        areaOfCircle = calculateArea (-20);
        if (areaOfCircle == YANLIS_PARAMETRE) {
            System.out.println ("yanlis parametre girdiniz");
        } else {
            System.out.println ("cemberin alani = " + areaOfCircle);
        }
        double areaOfRectangle = calculateArea (4, 8);
        System.out.println ("Diktörtgenin Alani = " + areaOfRectangle);
        double areaOfTriangle = calculateArea (3, 4, 5);
        System.out.println ("Ücgenin Alani= " + areaOfTriangle);
        areaOfTriangle = calculateArea (2, -1, -3);

        System.out.println (areaOfTriangle);
//        area(5.0); should return 78.53975
        System.out.println (calculateArea (5.0));

//        area(5.0); should return 78.53975
//
//                * area(-1);  should return -1 since the parameter is negative
        if (calculateArea (-1) !=-1) {
            System.out.println ("yanlis kod yazdiniz");
        }
//                * area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
        if (calculateArea (5.0,4.0) != 20) {
            System.out.println ("yanlis kod yazdiniz");
        }
//                * area(-1.0, 4.0);  should return -1 since first the parameter is negative
        if (calculateArea (-1,4) != -1) {
            System.out.println ("yanlis kod yazdiniz");
        }
    }

    private static double calculateArea(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return YANLIS_PARAMETRE;
        }
        double u = (a + b + c) / 2;
        double areaOfTriangle = Math.sqrt (u * (u - a) * (u - b) * (u - c));
        return areaOfTriangle;
    }

    public static double calculateArea(double radius) {
        if (radius < 0) {

            return YANLIS_PARAMETRE;
        }
        double x2 = (radius * radius * Math.PI);
        return x2;
    }

    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            return -1;
        }
        double rect = length * width;
        return rect;
    }
}

