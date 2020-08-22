package Exercises_If;
public class DecimalComperator {
    public static void main(String[] args) {
        System.out.println (areEqualByThreeDecimalPlaces (3.103, -3.103));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        if ((int) (firstNumber * 1000) == (int) (secondNumber * 1000)) {
            return true;
        } else {
            return false;
        }

    }
}
