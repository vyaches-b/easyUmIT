package module2.lesson1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик", true);

        System.out.println(dog);

        dog.setGoodBoy(false);

        System.out.println(dog);


        Point startingPoint = new Point(1,1);
        Ship ship = new Ship(startingPoint,4, true);

        System.out.println(startingPoint);
        System.out.println(ship);

    }
}
