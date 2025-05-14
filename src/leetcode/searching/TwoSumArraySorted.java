package src.leetcode.searching;

import java.util.Arrays;

public class TwoSumArraySorted {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    public static int[] twoSum(int[] numbers, int target) {
                int []ans={-1,-1};
                int start=0;
                int end=numbers.length-1;
                while(start<=end){
                    if(numbers[start]+numbers[end]==target){
                        ans[0]=start+1;
                        ans[1]=end+1;
                        return ans;
                    }
                    if(numbers[start]+numbers[end]<target){
                        start++;
                    }
                    else{
                        end--;
                    }
                }
                return ans;
            }
        }
