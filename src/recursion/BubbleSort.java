package src.recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={5,4,6,7,2,1};
        bubbleSortRecursion(arr.length,0,arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] bubbleSortRecursion(int length,int i,int [] arr) {
        if(length<0){
            return arr;
        }
        if(i<arr.length-1){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            return bubbleSortRecursion(length,++i,arr);
        }

        return bubbleSortRecursion(--length,0,arr);
    }
}
