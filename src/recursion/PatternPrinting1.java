package src.recursion;

public class PatternPrinting1 {
    /* * * * * *
       * * * *
       * * *
       * *
       *
     */
    public static void main(String[] args) {
        int n=4;
        printPattern(4,0);
    }

    private static void printPattern(int row, int column) {
        if(row<1){
            return;
        }
        if(column<row){
            System.out.print("*"+" ");
            printPattern(row,++column);
        }
        else{
            System.out.println();
            printPattern(--row,0);
        }
    }
}
