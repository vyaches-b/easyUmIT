package module2.lesson1;

import java.util.Arrays;

public class Ship {

    private Point startingPoint;
    private int length;
    private boolean isHorizontal;

    public Ship(Point startingPoint, int length, boolean isHorizontal) {
        this.startingPoint = startingPoint;
        this.length = length;
        this.isHorizontal = isHorizontal;
    }

    public Point getStartingPoint() {
        return startingPoint;
    }

    public int getLength() {
        return length;
    }

    public boolean isHorizontal() {
        return isHorizontal;
    }


    @Override
    public String toString() {
        return "Ship{" +
                "startingPoint=" + startingPoint +
                ", length=" + length +
                ", isHorizontal=" + isHorizontal +
                '}';
    }
}
