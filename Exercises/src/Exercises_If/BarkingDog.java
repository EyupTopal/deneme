package Exercises_If;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println (sholudWakeUp (true, 1));
        System.out.println (sholudWakeUp (false, 2));
        System.out.println (sholudWakeUp (true, 8));
        System.out.println (sholudWakeUp (true, -1));
    }

    public static boolean sholudWakeUp(boolean barking, int houroftheday) {
        if (barking == false || houroftheday < 0 || houroftheday > 23) {
            return false;
        } else if (barking == true && houroftheday >= 0 && houroftheday < 8 ) {
            return true;
        } else if (barking == true && houroftheday >= 22 && houroftheday < 23) {
            return true;
        } else return false;
    }
}