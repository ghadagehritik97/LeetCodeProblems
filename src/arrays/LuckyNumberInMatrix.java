package src.arrays;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class LuckyNumberInMatrix {
    public static void main(String[] args) {
        int [][]matrix={{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer>ans=new ArrayList();
        int column=0;
        for(int i=0;i<matrix.length;i++){
            int []index=findLowestInRow(matrix[i]);
            if(checkWithOtherRows(i,index,matrix)){
                ans.add(index[1]);
            }
        }
        return ans;
    }
    static boolean checkWithOtherRows(int currentRow,int []lowestOfRow,int [][]matrix){
        for(int i=0;i<matrix.length;i++){

            if(i!=currentRow && matrix[i][lowestOfRow[0]]>lowestOfRow[1])
            {
                return false;
            }
        }
        return true;
    }
    static public int[] findLowestInRow(int []row){
        int min=0;
        for(int j=1;j<row.length;j++){
            if(row[min]>row[j]){
                min=j;
            }
        }
        return new int []{min,row[min]};
    }
}
