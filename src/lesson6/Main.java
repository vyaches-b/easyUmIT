package lesson6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] securePassword = {0, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11};
        int[] securePassword1 = {0, 2, 7, 4, 5, 6, 3, 77, 99,1,1,1,1,1,1,1,0,11,1,1};
        System.out.println(Arrays.toString(getArraysEntries(securePassword, securePassword1)));

    }

    /**
     * Возвращает массив из элементов, которые есть и в первом массиве, и во втором.
     * @param source - Первый массив
     * @param compareTo - Второй массив
     * @return массив элементов
     */
    private static int[] getArraysEntries(int[] source, int[] compareTo) {

        //Если оба параметры равны, возвращаем первый массив без проверок
        if (source == compareTo) {
            return source;
        }

        //Если первый массив пустой, возвращаем его без проверок
        if (source.length < 1) {
            return source;
        }
        //Если второй массив пустой, возвращаем его без проверок
        else if (compareTo.length < 1) {
            return compareTo;
        }

        //Вычисляем максимально возможную длинну массива с совпадениями, она равна длинне меньшего массива
        int maxPossibleEntries = compareTo.length > source.length ? source.length : compareTo.length;
        int entryCount = 0;

        int[] entries = new int[maxPossibleEntries];


        for (int i = 0; i < maxPossibleEntries; i++) {
            if (arrayContains(compareTo[i], source) && !arrayContains(compareTo[i], entries)) {
                entries[entryCount] = compareTo[i];
                entryCount++;
            }
        }

            return Arrays.copyOf(entries, entryCount);
        }


    /**
     * Проверка числового массива на наличие в нем числа
     * @param number
     * @param array
     * @return
     */
    private static boolean arrayContains(int number, int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
