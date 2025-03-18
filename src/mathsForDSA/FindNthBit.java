package src.mathsForDSA;

public class FindNthBit {
    //code to find nth bit of a given number.
    public static void main(String[] args) {
        int n=394;
        System.out.println(Integer.toBinaryString(n));
        int index=4;
        //it will be represented in binary as 110001010 if i want to check bit at specific index approach will be
//        if we do & with any number it will return the same number so we have to do & at that specific index only
//        so if we want index at 5th then we have to do and with that numbers 5th index with 1 like n & 10000
//        in this case for 5th index four zeros came to right of 1 this can be achieved using left shift operator
//        like 1 << index-1. so the logic will be.
        System.out.println(Integer.toBinaryString(n & (1<<(index-1))));
    }
}