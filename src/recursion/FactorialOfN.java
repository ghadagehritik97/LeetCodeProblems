package src.recursion;

public class FactorialOfN {
    public static void main(String[] args) {
        int n=5;
        System.out.println(findFactorial(n));
    }

    private static long findFactorial(int n) {
        if(n==1){
            return 1;
        }
        return n*findFactorial(n-1);
    }
}
