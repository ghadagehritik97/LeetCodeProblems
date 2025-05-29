import javax.imageio.stream.ImageInputStream;

public class RotatedBinarSearch {
    public static void main(String[] args) {
        int[]nums={3,5,1};
        System.out.println(search(nums,3));
    }
    public static int search(int[] nums, int target) {
        int pivot=findPivot(nums,target);
        if(pivot==-1){
            return binarySearch(0, nums.length-1, target,nums);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        else if(target>=nums[0]){
            return binarySearch(0,pivot-1,target,nums);
        }
        return binarySearch(pivot+1,nums.length-1,target,nums);


    }
    public static int findPivot(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;
    }
    static int binarySearch(int start, int end, int target, int[] nums){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
