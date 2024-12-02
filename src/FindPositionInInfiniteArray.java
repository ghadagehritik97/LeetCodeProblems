package src;

public class FindPositionInInfiniteArray {
    public static void main(String[] args) {
        int []arr={3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        //mimic array is infinite so solve without using array length function
        System.out.println(findRange(arr,10));
    }

    private static int findRange(int[] arr, int target) {
        int start=0;
        int end=1;
        while (arr[end]<target){
            int newStart=end+1;
            end=(end-start+1)*2;
            start=newStart;
        }
        return binarySearchForElement(arr,start,end,target);
    }

    private static int binarySearchForElement(int[] arr, int start, int end,int target) {
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return ans;
    }
}
