package src.sortingTypes;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int lastIndex=arr.length-i-1;
            int maxIndex=findMaxElementIndex(arr,lastIndex);
            swapElement(arr,maxIndex,lastIndex);
        }


    }

    private static void swapElement(int[] arr, int maxIndex, int lastIndex) {
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[lastIndex];
        arr[lastIndex]=temp;
    }

    private static int findMaxElementIndex(int[] arr, int lastIndex) {
        int max=0;
        for(int i=1;i<=lastIndex;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
