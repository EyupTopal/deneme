package Exercises_If;
public class ArtikYil_LeapYear {
    public static void main(String[] args) {
        isLeapYear (1988);
    }
    public static void isLeapYear(int year) {
        System.out.println ("This program calculates leap year.");
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println (year + " is a leap year.");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println (year + " is a leap year.");
        } else {
            System.out.println (year + " is not a leap year.");
        }
    }
}
