package src.leetcode.Anjali;

import java.util.ArrayList;

public class MaxOfArray {
    public static void main(String[] args) {
//        int[] Ans = {2,5,1,8,9,34,98,90};
//        int max=0;
//        for(int i=0;i<Ans.length;i++) {
//             max = Math.max(max, Ans[i]);
//        }
            int max =5;
        int[] candies ={2,3,5,1,3};
        ArrayList<Boolean> Ans1 = new ArrayList<Boolean>();
        int n=3;
        for(int i=0;i<candies.length;i++){
            if(candies[i]+n>=max){
                Ans1.add(true);
            }
//            else{
//                Ans1.add(false);
//            }


        }
        System.out.println(Ans1);
    }
}
