package src.leetcode.Matrix;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
        public  static int[] productExceptSelf(int[] nums) {
            int []ans=new int[nums.length];
            int product=1;
            int zeroCount=0;
            for(int num:nums){
                if(num!=0){
                    product*=num;
                    continue;
                }
                zeroCount+=1;
            }
            for(int i=0;i<nums.length;i++){
                if(zeroCount==0){
                    ans[i]=product/nums[i];
                }
                if(zeroCount==1 && nums[i]==0){
                    ans[i]=product;
                }
                else if(zeroCount>1){
                    ans[i]=0;
                }
            }
            return ans;
        }
    }

