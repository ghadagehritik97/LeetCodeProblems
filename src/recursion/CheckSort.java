package src.recursion;

public class CheckSort {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(checkSort(arr,0));

    }

    private static boolean checkSort(int[] arr,int index) {
        if(arr.length-1==index) {
            return true;
        }
        return arr[index]<arr[index+1]&& checkSort(arr,index+1);
    }
}
