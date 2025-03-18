package src.mathsForDSA;

public class OccuringOnce {

    public static void main(String[] args) {
        //In an array every number is occuring thrice, only one number is occuring once find that number
        // Approach - every numbers binary representation will be present three times in the array if we
        //             add binary form and divide it by the multiples i.e 3 remainder will be the
        //            binary representation of number occurring once so i.te the answer.
        int []arr={1,1,2,4,7,6,5,3,2,4,5,6,1,2,4,6,5,3,3};
        System.out.println(findNumberOccurringOnce(arr));
        }
        // Method to find the element that occur only once
        static int findNumberOccurringOnce(int arr[])
        {
            int ones = 0, twos = 0;
            int common_bit_mask;

            for (int i = 0; i < arr.length; i++) {
            /*"one & arr[i]" gives the bits that are there in
            both 'ones' and new element from arr[]. We
            add these bits to 'twos' using bitwise OR*/
                twos = twos | (ones & arr[i]);

            /*"one & arr[i]" gives the bits that are
            there in both 'ones' and new element from arr[].
            We add these bits to 'twos' using bitwise OR*/
                ones = ones ^ arr[i];

            /* The common bits are those bits which appear third time
            So these bits should not be there in both 'ones' and 'twos'.
            common_bit_mask contains all these bits as 0, so that the bits can
            be removed from 'ones' and 'twos'*/
                common_bit_mask = ~(ones & twos);

                /*Remove common bits (the bits that appear third time) from 'ones'*/
                ones &= common_bit_mask;

                /*Remove common bits (the bits that appear third time) from 'twos'*/
                twos &= common_bit_mask;
            }
            return ones;
        }
}
