package src.leetcode.searching;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinimumInRBS {
    public static void main(String[] args) {
        int arr[]={11,13,15,17};
        System.out.println(findMin(arr));
    }
        public static int findMin(int[] arr) {
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(mid<end && arr[mid]>arr[mid+1]){
                    return arr[mid+1];
                }
                if(mid>start && arr[mid]<arr[mid-1]){
                    return arr[mid];
                }
                if(arr[start]>=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            return arr[0];

        }
    }
