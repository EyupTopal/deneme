package Exercices_For;

public class Sinav52 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 3, 4};
        for (int number : arr) {
            System.out.print (number);
            System.out.print (" ");
        }
        System.out.println ();

        for (int i = 0; i < arr.length-1; i++) {
            for (int number : arr) {
                number=number+1;
                System.out.print (number);
                System.out.print (" ");

            }
            System.out.println ();
        }
    }
}