package lesson4;

import java.util.Scanner;

public class WarmUp {

    public static void main(String[] args) {

        System.out.println(isEven(5));
        System.out.println(isEven(444));

    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
