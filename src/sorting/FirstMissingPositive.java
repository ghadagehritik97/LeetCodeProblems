package src.sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int []arr={7,8,9,11,12};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {

        cyclicSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;


    }
    public static void cyclicSort(int[]nums){
        int i=0;
        while(i<nums.length){
            int targetIndex=nums[i]-1;
            if(nums[i]<=nums.length && nums[i]>0 &&
                    nums[targetIndex]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[targetIndex];
                nums[targetIndex]=temp;
            }
            else{
                i++;
            }
        }
    }
}
