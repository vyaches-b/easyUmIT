package lesson2;

//Задание со звездочкой
public class ListEntry {
    public static void main(String[] args) {
        int[] listOne = {1,2,3,4};
        int[] listTwo = {1,5,6,7};

        boolean entryExists = false;

        for (int i = 0; i < listOne.length; i++){
            for (int j = 0; j < listTwo.length; j++){
                if(listOne[i]==listTwo[j]){
                    entryExists = true;
                }
            }
        }

        if (entryExists){
            System.out.println("В списках найдено пересечение");
        }
        else{
            System.out.println("Пересечение в списках не найдено");
        }

    }
}
