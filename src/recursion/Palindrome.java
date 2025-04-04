package src.recursion;

public class Palindrome {
    public static void main(String[] args) {
        int n=1232;
        System.out.println(isPalindrome(n));
    }

    private static boolean isPalindrome(int n) {
        int digits=(int)Math.log10(n)+1;
        return n==rev(n,digits);
    }

    private static int rev(int n,int digits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+rev(n/10,digits-1);
    }
}
