package lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrray1 = {1,2,3,4,5,6};
        int[] arrray2 = {1,2,3,4,5,6};
        System.out.println(Arrays.equals(arrray1,arrray2));

        System.out.println("Массив 1 = " + Arrays.toString(arrray1));
        System.out.println("Массив 2 = " + Arrays.toString(arrray2));
        System.out.println("Равны: " + equals(arrray1,arrray2));
    }

    public static boolean equals(int[] source, int[] compareTo) {
        if(source == compareTo){
            return true;
        }
        //проверка на совпадение длины массивов
        if (source.length != compareTo.length) {
            return false;
        }

        for (int i = 0; i < source.length; i++) {
            //при любом несовпадении завершаем проверку
            if (source[i] != compareTo[i]) {
                return false;
            }
        }
        return true;
    }
}
