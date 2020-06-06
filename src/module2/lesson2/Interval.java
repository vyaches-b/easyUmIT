package module2.lesson2;

public class Interval {
    private final int from;
    private final int to;
    private double a;

    public Interval(int from, int to) {
        if(from > to){
            throw new IllegalArgumentException("Значение \"с\" должно быть меньше или равно \"по\"");
        }

        this.from = from;
        this.to = to;
    }

    public boolean isInInterval(int number){
        return number >= from && number <= to;
    }

    public boolean isIntervalsCrossed(Interval interval){
        if (interval == null){
            return false;
        }
        return (interval.from <= from && interval.to >= from)
                ||
                (interval.from >= from && interval.from <= to);
    }
    @Override
    public String toString() {
        return "Интервал с " + from + " по " + to;
    }
}
