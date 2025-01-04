package src.sortingTypes;

import java.util.Arrays;
//cyclic sort is only for arrays containing elements from 1 to n
public class CyclicSort {
    public static void main(String[] args) {
        int []arr={5,2,1,4,3};
        int i=0;
        while(i<arr.length){
            int target=arr[i];
            if(arr[i]!=i+1){
               int temp=arr[target-1];
               arr[target-1]=arr[i];
               arr[i]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
