package Sinav;

public class Frage1 {
    public static void main(String[] args) {
        findMax (10, 20, 15);
    }

    public static void findMax(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            System.out.println (number1 + " is the maximum number.");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println (number2 + " is the maximum number.");
        } else {
            System.out.println (number3 + " is the maximum number.");
        }
    }
}
