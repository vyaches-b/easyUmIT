package lesson7;

import java.util.Arrays;

public class Main {

    static char SEA_FOG_OF_WAR = '~';
    static int SEA_SIZE = 9;
    static char SHIP = 'o';
    static char SHIP_HIT = 'x';
    static char SHIP_MISS = '*';
    static String consoleDivider = "--------------------------";

    public static void main(String[] args) {

        char[][] seaBattleField = getSea(SEA_SIZE);
        showSea(seaBattleField);


        boolean isHorizontal = false;
        int shipLength = 3;

        addShipTopSea(seaBattleField, 4,4, shipLength, isHorizontal);
        showSea(seaBattleField);

        shootAtShip(seaBattleField,1,1);
        showSea(seaBattleField);

        shootAtShip(seaBattleField,1,2);
        showSea(seaBattleField);
    }

    /**
     * Генерирует игровое поле для морского боя
     * @param size
     * @return sea - двумерный массив с игровым полем
     */
    private static char[][] getSea(int size){
        char[][] sea = new char[size][size];
        for(char[] row: sea){
            for(int column = 0; column < row.length; column++){
                row[column] = SEA_FOG_OF_WAR;
            }
        }
        return sea;
    }

    /**
     * Отображает в консоли игровое поле с легендой
     * @param sea - двумерный массив с игровым полем
     */
    private static void showSea(char[][]sea){
        //Вывод шапки с буквами
        System.out.print(" ");
        for (int i = 0; i < sea.length; i++){
            System.out.print((char)('A'+i) + " ");
        }
        System.out.println();

        //Вывод строк с цифрами
        int rowCounter = 1;
        for(char[] row: sea){
            System.out.print(rowCounter);
            rowCounter++;
            for(char column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    /**
     * Для заданной точки определяет находится ли в этой точке
     * корабль или нет (успешен ли ход игрока)
     * @param seaBattleField
     * @param x
     * @param y
     * @return
     */
    private static boolean shootAtShip(char[][] seaBattleField, int x, int y) {
        System.out.println(consoleDivider);
        System.out.println("Стреляем по координатам " + (char)('A' + x) + y);

        if(seaBattleField[x][y] == SHIP){
            seaBattleField[x][y] = SHIP_HIT;
            System.out.println("Попал!");
            System.out.println(consoleDivider);
            return true;
        }
        else {
            seaBattleField[x][y] = SHIP_MISS;
            System.out.println("Мимо!");
            System.out.println(consoleDivider);
            return false;
        }

    }

    /**
     * Размещает корабль на игровом поле
     * @param seaBattleField - игровое поле
     * @param x
     * @param y
     * @param shipLength - длина корабля. Максимальная длинна 5
     * @param isHorizontal
     */
    private static void addShipTopSea(char[][] seaBattleField, int x, int y, int shipLength, boolean isHorizontal) {
        if(isHorizontal){
            for(int column = y; column < y + shipLength; column++){
                seaBattleField[x][column] = SHIP;
            }
        }
        else {
            for(int row = x; row < x + shipLength; row++){
                seaBattleField[row][y] = SHIP;
            }

        }

    }

}
