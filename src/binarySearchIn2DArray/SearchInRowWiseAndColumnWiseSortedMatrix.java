package src.binarySearchIn2DArray;

import java.util.Arrays;
//Code for finding any element in 2D array where array is sorted coulmn wise and row wise
public class SearchInRowWiseAndColumnWiseSortedMatrix {

    public static void main(String[] args) {
      int [][]matrix={
              {10, 20, 30, 40},
              {12, 22, 32, 42},
              {14, 24, 34, 44},
              {16, 26, 36, 46}
      };
      int target=50;
      System.out.println(Arrays.toString(findPositionInMatrix(matrix,target)));
    }

    private static int[] findPositionInMatrix(int[][] matrix, int target) {

        int row=0;
        int column=matrix.length-1;
        while(row< matrix.length && column>=0){
            if(matrix[row][column]==target){
                return new int[]{row,column};
            }
            if(matrix[row][column]>target)
            {
                column--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }

}
