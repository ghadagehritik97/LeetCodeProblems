package src.arrays;

import java.util.Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(transpose(matrix)));
    }
    public static int[][] transpose(int[][] matrix) {
        int [][]transpose1=new int [matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){
                transpose1[j][i]=matrix[i][j];
            }

        }
        return transpose1;

    }
}
