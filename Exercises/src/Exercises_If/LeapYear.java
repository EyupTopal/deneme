package Exercises_If;
public class LeapYear {
    public static void main(String[] args) {
        System.out.println ("This program calculates leap year.");
        int year = 1800;
        boolean isValid = isLeapYear (year);
        if (isValid) {
            System.out.println (year + " is a leap year");
        } else {
            System.out.println (year + " is not a leap year");
        }
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year >= 10000) {
            return false;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 == 0 && year %400!=0) {
            return false;
        } else if (year % 4 == 0 && year%100!=0 && year%400!=0) {
            return false;
        }
        return false;
    }
}

