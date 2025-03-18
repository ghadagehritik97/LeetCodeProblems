package src.mathsForDSA;

public class FindEvenOrOdd {
    public static void main(String[] args) {
        int num=68;
        System.out.println(findOdd(num));
    }

    private static String findOdd(int num) {
        //logic is in binary if 2 raise to 0 condition if any number is satisfying that number will be odd
//    so to check that we are doing and for each number with one if and is one then its odd or else even.
        if((num & 1)==1){
            return "Odd";
        }
        else
            return "Even";
    }

}
