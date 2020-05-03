package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                Random random = new Random();
                int secretNumber = random.nextInt(5) + 1;
        System.out.println(secretNumber);


        boolean numberGuessed = false;

        System.out.println("Какое число загадано?");
        while (!numberGuessed) {
            System.out.print("> ");
            numberGuessed = isUserGuessed(Integer.parseInt(scanner.nextLine()), secretNumber);
            if (numberGuessed) {
                System.out.println("Ура, угадал! Игра окончена.");

            } else {
                System.out.println("Не угадал");
            }

        }


    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isUserGuessed(int userGuess, int secretNumber) {
        return userGuess == secretNumber;
    }
}
