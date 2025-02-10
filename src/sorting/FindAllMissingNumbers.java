package src.sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>ans=new ArrayList();
        cyclicSort(nums);
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i]){
                ans.add(i+1);
            }
        }
        return ans;

    }
    public static void cyclicSort(int []nums){
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(nums[correctIndex]!=nums[i]){
                int temp=nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;
            }
            else{
                i++;
            }
        }
    }
}
