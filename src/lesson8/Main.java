package lesson8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tour[] tours = new Tour[10];
        Tour russiaTour = new Tour(
                "SP125",
                "Путешествие в Санкт-Петербург", "Лучшее что происходило с Вами!",
                new Date(),
                15, 51_000, "Россия");

        Tour usaTour = new Tour(
                "NY511",
                "Путешествие в Нью-Йорк", "Худшее что происходило с Вами!",
                new Date(),
                12, 257_000, "США");

        tours[0] = russiaTour;
        tours[1] = usaTour;

        Scanner scanner = new Scanner(System.in);

        showMenu();
        while (true) {
            System.out.println("> ");
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    printTours(tours);
                    break;
                case 2:
                    addTour(tours, createNewTour());
                    break;
                case 3:
                    deleteTour(tours);
                    break;
                case 4:
                    searchTour(tours);
                    break;
                case 5:
                    showMenu();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("undefined");
            }
        }

    }

    /**
     * Выводит в консоль информацию о каждом туре
     * @param tours
     */
    public static void printTours(Tour[] tours) {
        System.out.println("Список туров: ");
        System.out.println("========================");
        for (Tour tour : tours) {
            if (tour == null) {
                return;
            } else {
                tour.printTour();
            }
        }
    }

    /**
     * Удаление элемента из списка туров
     * Если элемент не найден, выводится соответствующее сообщение
     * @param tours
     */
    public static void deleteTour(Tour tours[]) {
        System.out.println("========================");
        System.out.println("Введите код тура, который необходимо удалить: ");
        Scanner scanner = new Scanner(System.in);
        String deleteTour = scanner.nextLine();

        int deleteIndex = 0;
        for (int i = 0; i < tours.length; i++) {
            if(tours[i] == null){
                break;
            }
            if (tours[i].code.equals(deleteTour)) {
                deleteIndex = i;
                for (int j = deleteIndex; j < tours.length - deleteIndex - 1; j++) {
                    tours[j] = tours[j + 1];
                    tours[j + 1] = null;
                }
                return;
            }
        }
        System.out.println("Тур \"" + deleteTour + "\" не найден. ");
    }

    public static void searchTour(Tour tours[]) {
        System.out.println("========================");
        System.out.println("Введите код тура, который необходимо найти: ");
        Scanner scanner = new Scanner(System.in);
        String searchTour = scanner.nextLine();

        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                break;
            }
            if (tours[i].code.equals(searchTour)) {
                System.out.println("Найден тур: ");
                System.out.println("========================");
                tours[i].printTour();
                return;
            }
        }
        System.out.println("Тур не найден. ");

    }


    /**
     *
     * @return
     */
    public static Tour createNewTour() {
        Tour newTour = new Tour();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите код тура: ");
        newTour.code = scanner.nextLine();

        System.out.println("Введите название тура: ");
        newTour.name = scanner.nextLine();

        System.out.println("Введите описание тура: ");
        newTour.desc = scanner.nextLine();


        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Введите дату тура: ");
        String dateStr = scanner.nextLine();
        try {
            newTour.date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("Введите страну тура: ");
        newTour.country = scanner.nextLine();

        System.out.println("Введите стоимость тура: ");
        newTour.cost = scanner.nextInt();

        return newTour;
    }

    /**
     * Добавляет элемент в список туров
     * @param tours
     * @param newTour
     */
    public static void addTour(Tour[] tours, Tour newTour) {
        for (int i = 0; i < tours.length; i++) {
            if (tours[i] == null) {
                tours[i] = newTour;
                return;
            }
        }
    }

    /**
     * Выводит в консоль пункты меню
     */
    public static void showMenu() {
        menuItem("Программа \"Подбор туров\"");
        menuItem("1 - Показать список туров");
        menuItem("2 - Добавить тур в список");
        menuItem("3 - Удалить тур из списка");
        menuItem("4 - Поиск тура из списка");
        menuItem("5 - Помощь");
        menuItem("6 - Выйти");
    }
    
    public static void menuItem(String item) {
        System.out.println(item);
    }

}
