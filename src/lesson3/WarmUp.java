package lesson3;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {

        //Разминка
        Scanner scanner = new Scanner((System.in));

        int userInput = 0;

        System.out.println("Введите число для проверки:");
        System.out.print("> ");
        userInput = Integer.parseInt(scanner.nextLine());

        if (userInput % 5 == 0) {
            System.out.println("Число делится на 5 без остатка");
        } else {
            System.out.println("Число не делится на 5 без остатка");
        }
    }
}
