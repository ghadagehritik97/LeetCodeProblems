package src.recursion;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int []arr={5,3,6,4,1};
        System.out.println(Arrays.toString(selectionSortUsingRecursion(arr, arr.length, 0,0)));
    }

    private static int[] selectionSortUsingRecursion(int[] arr, int row, int column,int max) {
        if(row==0){
            return arr;
        }
        if(column<row){
            if(arr[column]>arr[max]){
                return selectionSortUsingRecursion(arr,row,column+1,column);
            }
            else{
                return selectionSortUsingRecursion(arr,row,column+1,max);
            }
        }
        int temp=arr[max];
        arr[max]=arr[column-1];
        arr[column-1]=temp;
        return selectionSortUsingRecursion(arr,row-1,0,0);

    }
}
