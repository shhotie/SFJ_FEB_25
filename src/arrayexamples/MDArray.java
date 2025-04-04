package arrayexamples;

import java.util.Arrays;

public class MDArray {
    public static void main(String[] args) {
////        Declare
//        int [][] matrix;
//        // Initialization
//        matrix = new int[3][3];

        // Default val int = 0, boolean= false, Object = null;
        int [][] matrix1 = new int[3][3];
        matrix1[0][0]=10;
        matrix1[0][1]=20;
        System.out.println(Arrays.deepToString(matrix1));

        int[][] matrix = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        // sum of each row in array
        for (int row=0; row < matrix.length ; row++){
            int rowSum =0;
            for (int col=0; col < matrix[row].length; col++){
              rowSum+= matrix[row][col];
            }
            System.out.println("sum of row " + row + " = " + rowSum);
        }

        System.out.println(Arrays.deepToString(matrix));
        for (int row=0; row < matrix.length ; row++){
            for (int col=0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("Using Advanced For loop");
        for (int[] row : matrix){
            for (int col : row){
                System.out.print(col+ " ");
            }
            System.out.println();
        }

    }
}
