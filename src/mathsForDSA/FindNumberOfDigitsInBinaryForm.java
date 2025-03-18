package src.mathsForDSA;

public class FindNumberOfDigitsInBinaryForm {
    public static void main(String[] args) {
        int n=10;
        int b=2; //because we need to calculate in binary form
        //formula
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);

        //we can do this using right shift operator also.
    }
}
