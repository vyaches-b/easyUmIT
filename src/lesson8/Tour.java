package lesson8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tour {
    String code; //код
    String name; //название
    String desc; //описание
    Date date; //дата вылета
    int daysDuration; //длительность
    int cost; //стоимость
    String country; //Страна
    private String currency = "руб.";

    public Tour(String code, String name, String desc, Date date, int daysDuration, int cost, String country) {
        this.code = code;
        this.name = name;
        this.desc = desc;
        this.date = date;
        this.daysDuration = daysDuration;
        this.cost = cost;
        this.country = country;
    }

    public Tour(){

    }

    public void printTour() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(country + " " + cost + " " + currency + " " + sdf.format(date) + " на " + daysDuration + " дней.");
        System.out.println(desc);
        System.out.println("========================");
    }

}
