package src.arrays;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int [][]image={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int length=image.length;
        int [][]revImage=new int[length][length];
        for(int i=0;i<image.length;i++){
            int count=image[i].length-1;
            for(int j=0;j<image[i].length;j++){
                revImage[i][count]=image[i][j];
                count--;
            }

        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(revImage[i][j]==1){
                    revImage[i][j]=0;
                }
                else{
                    revImage[i][j]=1;
                }
            }
        }
        return revImage;
    }
}
