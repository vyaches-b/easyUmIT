package lesson3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Основное задание
        Scanner scanner = new Scanner((System.in));

        int numbersCount = 0;
        int max = 0;
        int min = 0;
        int zeroCount = 0;
        int currentNumber = 0;

        System.out.println("Введите количество цифр:");
        System.out.print("> ");
        numbersCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbersCount; i++) {
            System.out.println("Введите новое число:");
            System.out.print("> ");
            currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber == 0) {
                zeroCount++;
            }
            if (currentNumber > max) {
                max = currentNumber;
            } else if (currentNumber < min) {
                min = currentNumber;
            }
        }

        System.out.println("-----------------------");
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Количество нулей: " + zeroCount);
    }
}
