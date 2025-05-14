package src.leetcode.Matrix;

import java.util.Arrays;
/* [1,2,3,4]
  [12,13,14,5],
  [11,16,15,6],
  [10,9,8,7]]*/

public class SpiralMatrix2 {
    public static void main(String[] args) {
        int n=4;
        System.out.println(Arrays.toString(generateMatrix(n)));
    }
    public  static int[][] generateMatrix(int n) {

            int [][]matrix=new int [n][n];
            int top=0;
            int left=0;
            int right=matrix[0].length-1;
            int bottom=matrix.length-1;
            int count=1;
            while(left<=right && top<=bottom){
                for(int i=top;i<=right;i++){
                    matrix[left][i]=count;
                    count++;
                }
                top++;
                for(int i=top;i<=bottom;i++){
                    matrix[i][right]=count;
                    count++;
                }
                right--;
                if(left<=right){
                    for(int i=right;i>=left;i--){
                        matrix[bottom][i]=count++;

                    }
                    bottom--;
                }

                if(top<=bottom){
                    for(int i=bottom;i>=top;i--){
                        matrix[i][left]=count++;
                    }
                    left++;
                }
            }
            return matrix;
        }
    }

