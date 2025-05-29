package src.leetcode.searching;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[]nums1={1,1};
        int[]nums2={2,2};
        System.out.println(Arrays.toString(fairCandySwap(nums1,nums2)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a=0;
        int b=0;
        for(int candies:aliceSizes){
            a+=candies;
        }
        for(int candies:bobSizes){
            b+=candies;
        }
        int i;
        int j=0;
        boolean found=false;
        for( i=0;i<aliceSizes.length;i++){
            for( j=0;j<bobSizes.length;j++){
                if((a-aliceSizes[i]+bobSizes[j])==(b-bobSizes[j]+aliceSizes[i])){
                    found=true;
                    break;
                }

            }
            if(found){
                break;
            }
        }
        int []ans ={aliceSizes[i],bobSizes[j]};
        return ans;

    }
}
