package src.recursion;

public class PatternPrinting2 {
    /* *
       * *
       * * *
       * * * *
     */
    public static void main(String[] args) {
        triangle(1,1,4);
    }

    private static void triangle(int row, int column,int n) {
        if(row>n){
            return;
        }
        if(column<=row){
            System.out.print("* ");
            triangle(row,++column,n);
        }else {
            System.out.println();
            triangle(++row,1,n);
        }
    }
}
