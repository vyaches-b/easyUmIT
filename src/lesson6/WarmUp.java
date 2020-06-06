package lesson6;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {

        int[] securePassword = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] securePassword = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] securePassword = {1, 2, 3};
        //int[] securePassword = {1};
        //int[] securePassword = {};

        System.out.println(Arrays.toString(securePassword));

        flipArray(securePassword);
        System.out.println(Arrays.toString(securePassword));
    }

    private static void flipArray(int[] array) {

        int lastNumber = 0;
        int arrayLength = array.length - 1;

        for (int i = 0; i < arrayLength/2; i++) {
            lastNumber = array[arrayLength - i];
            array[arrayLength - i] = array[i];
            array[i] = lastNumber;

        }

    }
}
