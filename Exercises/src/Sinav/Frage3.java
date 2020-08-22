package Sinav;

public class Frage3 {
    public static void main(String[] args) {
        calculateBMI (70, 170);
    }

    public static void calculateBMI(int weight, int height) {
        double MBI = (double) weight * 100 * 100 / (height * height);
        System.out.println (MBI);
    }
}
