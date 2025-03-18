package src.mathsForDSA;

public class PrimeNumbersTillN {
    public static void main(String[] args) {
        int n=40;
        boolean []primes=new boolean[n+1];
        isItPrime(n,primes);
    }

    private static void isItPrime(int n, boolean[] primes) {

        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    if(!primes[j])
                     primes[j]=true;
                }
            }
        }
        for(int i=2;i< primes.length;i++){
            if(!primes[i])
             System.out.println(i+" ");
        }
    }
}
