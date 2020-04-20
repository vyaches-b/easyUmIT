package lesson2;

public class Cinema {


    public static void main(String[] args) {
        int rate = 5;

        //Вариант с if else
        if (rate == 1) {
            System.out.println(Rate.ONE.getMessage());
        } else if (rate == 2) {
            System.out.println(Rate.TWO.getMessage());
        } else if (rate == 3) {
            System.out.println(Rate.THREE.getMessage());
        } else if (rate == 4) {
            System.out.println(Rate.FOUR.getMessage());
        } else if (rate == 5) {
            System.out.println(Rate.FIVE.getMessage());
        } else {
            System.out.println(Rate.UNKNOWN.getMessage());
        }

        //Вариант switch
        switch (rate) {
            case 1:
                System.out.println(Rate.ONE.getMessage());
                break;
            case 2:
                System.out.println(Rate.TWO.getMessage());
                break;
            case 3:
                System.out.println(Rate.THREE.getMessage());
                break;
            case 4:
                System.out.println(Rate.FOUR.getMessage());
                break;
            case 5:
                System.out.println(Rate.FIVE.getMessage());
                break;
            default:
                System.out.println(Rate.UNKNOWN.getMessage());
        }

    }
}
