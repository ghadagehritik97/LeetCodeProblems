package src;
//question https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int []nums={7,2,5,10,8};
        System.out.println(splitArray(nums,2));
    }

    public static int splitArray(int[] nums, int k) {
        //7,2,5,10,8
        return splitArrayLargestSum(nums,k);
    }
    public static int splitArrayLargestSum(int []nums,int k){
        //finding start and end
        int start=0;
        int end =0;
        //minimum sum that we can get is largest element of array i.e start
        //maximum sum will be sum of array i.e. end

        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        //now apply bs
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;//atleast we can have one piece
            for(int num:nums){
                //middle is the number till sum is allowed
                if(sum+num>mid){
                    //if sum is exceeding then next number will be new sum i.e num
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }

            if(pieces>k){//this means we are assuming less sum so sum should be increased
                start=mid+1;
            }
            else{
                end=mid;
            }

        }
        return end;
    }
}
