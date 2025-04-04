package src.recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n=1201240;
        System.out.println(countZeros(n,0));
    }

    private static int countZeros(int n,int count) {
        if(n==0){
            return count;
        }
        if(n%10==0){
            return countZeros(n/10,++count);
        }
        return countZeros(n/10,count);
    }
}
