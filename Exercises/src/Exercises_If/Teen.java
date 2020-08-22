package Exercises_If;

public class Teen {
    public static void main(String[] args) {
        System.out.println (hasTeen (14, 44, 44));
        System.out.println (isTeen (21));
    }

    public static boolean hasTeen(int x1, int x2, int x3) {
        if (x1 >= 13 && x1 < 20 || x2 >= 13 && x2 < 20 || x3 >= 13 && x3 < 20) {
            return true;
        } else return false;
    }

    public static boolean isTeen(int y1) {
        if (y1 >= 13 && y1 < 20) {
            return true;
        } else return false;
    }
}
