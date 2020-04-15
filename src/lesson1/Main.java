package lesson1;

public class Main {
    public static void main(String args[]) {
        int a = 6;
        int b = 2;
        int c = 5;

        double result = 0;

        if (a == 0)
            System.out.println("Деление на ноль недопустимо");
        else
            result = (double) (b + c) / a;

        System.out.println("Полученный результат: " + result);

    }
}
