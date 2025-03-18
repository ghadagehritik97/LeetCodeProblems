package src.mathsForDSA;

public class UniqueNumberInArray {
    public static void main(String[] args) {
        int []arr={1,2,4,3,6,3,4,2,1};
        int ans=findUnique(arr);
        System.out.println(ans);
    }

    private static int findUnique(int[] arr) {
        int unique=0;
        for(int a:arr){
           unique^=a;
        }
        return unique;
    }

}
