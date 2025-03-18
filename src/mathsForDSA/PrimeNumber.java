package src.mathsForDSA;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=10;
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        int c=2;
        if(n<=1){
            return false;
        }
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
