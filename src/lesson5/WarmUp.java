package lesson5;

import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {

        int[] testArray = {1, 56, -55, 1212, 0, 77777};
        //int[] testArray = {};
        System.out.println("testArray = " + Arrays.toString(testArray));
        System.out.println("max = " + max(testArray));
    }

    public static int max(int[] array) {
        //Проверка на пустой массив
        if (array.length == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
