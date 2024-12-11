package src.binarySearchOn1DArray;

public class SearchInRoatatedSortedArray {
    public static void main(String[] args) {
        int arr[]={6,7,1,2,3,4,5};
        System.out.println(search(arr,3));
    }
        public static int search(int[] nums, int target) {
            //4,5,6,7,0,1,2
            int peak=findPeak(nums);
            // if pivot is not present it mean its not roatated array do normal  binary search
            if(peak==-1){
                return BS(nums,target,0,nums.length-1);
            }
            if(nums[peak]==target){
                return peak;
            }
            else if(target>=nums[0]){
                return BS(nums,target,0,peak-1);
            }
            return BS(nums,target,peak+1,nums.length-1);

        }
        static int BS(int []arr,int target,int start,int end){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]==target)
                {
                    return mid;
                }
                else if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

            return -1;
        }
       static int findPeak(int []arr){
            int start=0;
            int end=arr.length-1;
            while(start<end){
                int mid=start+(end-start)/2;
                if(mid<end && arr[mid]>arr[mid+1]){
                    return mid;
                }
                if( mid>start && arr[mid]<arr[mid-1]){
                    return mid-1;
                }
                if(arr[start]>=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
            return -1;
        }
    }

