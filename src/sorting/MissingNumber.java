package src.sorting;

import java.util.Arrays;

public class MissingNumber {
    //find missing number in 0 to n array
    public static void main(String[] args) {
        int []arr={3,0,1};
        sortArray(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(findMissing(arr));

    }

    private static int findMissing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i){
                return i;
            }

        }
        return arr.length;
    }

    private static void sortArray(int[] arr) {
        int i=0;
        while(i<arr.length){
            int targetIndex=arr[i];
            if(i!=arr[i]&& arr[i]<arr.length){
                int temp=arr[targetIndex];
                arr[targetIndex]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
    }
}
