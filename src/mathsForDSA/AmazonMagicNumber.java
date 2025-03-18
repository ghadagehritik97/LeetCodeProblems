package src.mathsForDSA;

public class AmazonMagicNumber {
    public static void main(String[] args) {
        // magic number means addition of power of 5 of set bits of a number is magic number
        // number 4 in binary will be 100 so set bit is 1 and its position is 3 so 5 power 3 is 125

        int n=5;
        System.out.println(magicNumber(n));
    }

    private static int magicNumber(int n) {
        int ans=0;
        int base=5;
        while(n>0){
            //below expression will give last digit
            int bin=n&1;
            //below right shift expression will remove last integer of number
            n=n>>1;
            ans+=bin*base;
            base*=5;
        }
        return ans;
    }
}
