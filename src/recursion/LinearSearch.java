package src.recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr={1,3,4,6,2,8};
        System.out.println(searchIndexOfTarget(arr,9,0));
    }

    private static int searchIndexOfTarget(int[] arr, int target,int index) {
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return searchIndexOfTarget(arr,target,index+1);
    }
}
