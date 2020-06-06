package lesson7;

public class WarmUp {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3,4,5},
                {55,61,2,0}
        };

        System.out.println(matrixMax(matrix));

    }

    /**
     * определяет максимальный элемент в матрице
     * @param matrix
     * @return найденный элемент int
     */
    private static int matrixMax(int[][] matrix){
        int max = Integer.MIN_VALUE;

        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++){
                max = matrix[row][column] > max ? matrix[row][column] : max;
            }
        }
        return max;
    }

}
