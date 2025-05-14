package src.leetcode.Matrix;
//https://leetcode.com/problems/rotate-array/
public class RotateArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
    }
    public static void rotate(int[] nums, int k) {

        int n=nums.length;
        //below line is to tackle k>n condition
        k%=n;
        //first reverse whole array.
        reverse(nums,0,n-1);
        //then reverse elements from 0 to k-1
        reverse(nums,0,k-1);
        //then reverse nums from k to n-1
        reverse(nums,k,n-1);
    }
    public static void reverse(int[]nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
