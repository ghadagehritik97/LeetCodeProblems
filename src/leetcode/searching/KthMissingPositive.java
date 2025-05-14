package src.leetcode.searching;

public class KthMissingPositive {
    public static void main(String[] args) {
        int []arr={1,2,3};
        int k=3;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return k+end+1;
    }
}
