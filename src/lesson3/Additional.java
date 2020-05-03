package lesson3;

import java.util.Scanner;

public class Additional {
    public static void main(String[] args) {
        //Дополнительное задание
        System.out.println("Введите число для поиска:");
        System.out.print("> ");

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int numberCopy = number;
        int max = 0;
        int digitsCounter = 0;

        //Считаем сколько цифр в числе
        while (numberCopy > 0) {
            numberCopy /= 10;
            digitsCounter++;
        }

        numberCopy = number;
        //Ищем максимальную цифру
        while (digitsCounter > 0) {
            //Если текущее значение по делению
            if (numberCopy % 10 > max) {
                max = numberCopy % 10;
            }
            numberCopy /= 10;
            digitsCounter--;
        }
        System.out.println("Максимальная цифра числа: " + max);
    }
}
