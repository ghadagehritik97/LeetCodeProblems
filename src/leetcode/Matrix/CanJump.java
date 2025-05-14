package src.leetcode.Matrix;

public class CanJump {
    public static void main(String[] args) {
        int[]nums={0,1};
        long startTime=System.currentTimeMillis();
        System.out.println(canJump(nums));
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
    public static boolean canJump(int[] nums) {
        if(nums.length==1 || (nums.length==2 && nums[1]==0)){
            return true;
        }
        if(nums[1]==0){
            return false;
        }
        int atIndex=1+nums[1];
        while(atIndex<nums.length){
            if(nums[atIndex]==0){
                return false;
            }
            if(atIndex==nums.length-1){
                return true;
            }
            int jump=nums[atIndex];
            if(nums[atIndex+jump]>nums.length){
                return false;
            }
            atIndex+=jump;
        }
        return false;

    }
}
