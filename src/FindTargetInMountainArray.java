package src;
//https://leetcode.com/problems/find-in-mountain-array/description/

public class FindTargetInMountainArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,3,1};
        int target=3;
        int peak=findPeak(arr);
        int firstTry=OrderAgnosticBinarySearch(arr,target,0,peak);
        if(firstTry!=-1){
            System.out.println(firstTry);;
        }else {
            System.out.println(OrderAgnosticBinarySearch(arr, target, peak, arr.length - 1));
        }
    }

    private static int OrderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid;
            }
            else if(arr[mid]<target){
                start=mid;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    private static int findPeak(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
}
