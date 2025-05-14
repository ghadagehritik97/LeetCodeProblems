package src.leetcode.Matrix;

//https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeros {
    public static void main(String[] args) {
        int [][]matrix={{1,1,1},
                        {1,0,1},
                        {1,1,1}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = -1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == -1) {
                    setTop(i, j, matrix);
                    setBottom(i, j, matrix);
                    setLeft(i, j, matrix);
                    setRight(i, j, matrix);
                }
            }
        }
    }

    public static void setTop(int i, int j, int[][] matrix) {
        matrix[i][j] = 0;
        if (i == 0) {
            return;
        }
        while (i >= 0) {
            if (matrix[i][j] != -1)
                matrix[i][j] = 0;
            i--;
        }
    }

    public static void setBottom(int i, int j, int[][] matrix) {
        matrix[i][j] = 0;
        if (i == matrix.length - 1) {
            return;
        }
        while (i <= matrix.length - 1) {
            if (matrix[i][j] != -1)
                matrix[i][j] = 0;
            i++;
        }
    }

    public static void setLeft(int i, int j, int[][] matrix) {
        matrix[i][j] = 0;
        if (j == 0) {
            return;
        }
        while (j >= 0) {
            if (matrix[i][j] != -1)
                matrix[i][j] = 0;
            j--;
        }
    }

    public static void setRight(int i, int j, int[][] matrix) {
        matrix[i][j] = 0;
        if (j == matrix[i].length - 1) {
            return;
        }
        while (j <= matrix[i].length - 1) {
            if (matrix[i][j] != -1)
                matrix[i][j] = 0;
            j++;
        }
    }
}

