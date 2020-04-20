package lesson2;

public enum Rate {
    ONE ("Ужасно"),
    TWO ("Очень плохо"),
    THREE ("Пойдет"),
    FOUR("Хорошо"),
    FIVE ("Шикарно"),
    UNKNOWN ("Неизвестная оценка");

    private String message;

    Rate(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

}
