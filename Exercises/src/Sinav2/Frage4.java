package Sinav2;

import java.util.Arrays;

public class Frage4 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 7, 9, 8, 2,0};
        biggestNumber (arr);

    }

    private static void biggestNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println (Arrays.toString (arr));
        System.out.println ("Second Biggest Number is= "+ arr[1]);
    }
}