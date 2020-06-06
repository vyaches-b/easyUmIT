package module2.lesson2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 BigDecimal dc = new BigDecimal(0);
        System.out.println(dc);
        /*
        Задание 1
        Написать метод, который нормализует строку:
            • удалит проблемы слева и справа;
            • приведет все символы к нижнему регистру;
            • первый символ строки приведет к верхнему регистру;
            • пример работы: « пОбЕДА » -> «Победа»
         */
        String strToFormat = "пОбеДа";
        strToFormat = formatString(strToFormat);
        System.out.println(strToFormat);


        /*
        Задание 2
        Определить класс интервал (граничные значения включаются):
            создать два целочисленных атрибута, значение от и значение до;
            определить конструктор;
            учесть частный случай, когда значения от и до совпадают (это допустимо);
            реализовать метод, который для заданного параметром числа определит, входит это число в интервал или нет
            (возвращаемый тип boolean);
            реализовать метод, который для заданного параметром интервала определит, пересекаются интервалы или нет
            (возвращаемый тип boolean);
            переопределить метод вывода: предложить более подходящий вариант, чем по умолчанию
         */
        Interval interval = new Interval(1,10);
        Interval newInterval = new Interval(-5,11);

        System.out.println(interval.isInInterval(11));
        System.out.println(interval.isIntervalsCrossed(newInterval));

        /*
        Сосчитать число слов в предложении, которое ввел пользователь:
            • разделителем слов считать пробел, «.», «,», «:», «;»
            • пример работы:

        Введите предложение > Погода была ужасная: ветер выл, мокрый снег падал хлопьями.
        Число слов: 9
         */
        String ss = "Погода была ужасная: ветер выл, мокрый снег падал хлопьями.";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите предложение:");
        System.out.print("> ");
        ss = scanner.nextLine();

        ss = ss.replaceAll("[,.;:]","");

        System.out.println(Arrays.toString(ss.split("\\s")));
        System.out.println(ss.split("\\s").length);

    }

    /**
     * Метод, который нормализует строку:
     * • удалит проблемы слева и справа;
     * • приведет все символы к нижнему регистру;
     * • первый символ строки приведет к верхнему регистру;
     * • пример работы: « пОбЕДА » -> «Победа»
     * @param s
     * @return нормализованная строка
     */
    public static String formatString(String s){
        if (s == null){
            return null;
        }
        return s.substring(0,1).toUpperCase() + s.substring(1).trim().toLowerCase();
    }
}
