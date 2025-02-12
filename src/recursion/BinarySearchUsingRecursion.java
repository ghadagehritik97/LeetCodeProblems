package src.recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int []arr={1,12,43,55,89,99,105};
        int key=10;
        int ans=searchIndex(arr,0,arr.length-1,key);
        System.out.println(ans);
    }

    private static int searchIndex(int[] arr, int s, int e, int key) {
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
            return searchIndex(arr,s,mid-1,key);
        }
        return searchIndex(arr,mid+1,e,key);

    }

}
