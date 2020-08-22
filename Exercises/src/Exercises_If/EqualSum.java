package Exercises_If;

public class EqualSum {
    public static void main(String[] args) {

        System.out.println (hasEqualSum (1, 2, 2));
    }

    public static boolean hasEqualSum(int x1, int x2, int x3) {
        if (x1 + x2 == x3) {
            return true;
        } else return false;
    }
}
