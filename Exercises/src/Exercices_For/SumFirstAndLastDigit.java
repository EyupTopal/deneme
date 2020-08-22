package Exercices_For;

public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        sumFirstAndLastDigit (88);
    }
    public static void sumFirstAndLastDigit(int number) {
        int firstDigit, lastDigit;
        if (number < 0) {
            System.out.println ("-1");
        }
        if (number == 0) {
            System.out.println ("0");
        }
        if (number > 0 && number < 10) {
            number = number + number;
            System.out.println (number);
        }
        lastDigit = number % 10;
        firstDigit = number;
        while (firstDigit > 9) {
            firstDigit = firstDigit / 10;
            System.out.println (firstDigit + lastDigit);
        }
    }
}
