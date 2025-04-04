package src.recursion;

import java.util.ArrayList;
import java.util.List;

public class IndexOfDuplicates {
    public static void main(String[] args) {
        int []arr={1,2,4,5,7,9,3,1};
        List<Integer> ans=new ArrayList<>();
//        System.out.println(findDuplicates(arr,1,ans,0));
        System.out.println(findDuplicatesWithoutArgument(arr,1,0));

    }

    private static List<Integer> findDuplicatesWithoutArgument(int[] arr, int target, int index) {
        List<Integer>answer=new ArrayList<>();
        if(index==arr.length){
            return answer;
        }
        if(arr[index]==target){
            answer.add(index);
        }
        List<Integer>belowCallAnswers=findDuplicatesWithoutArgument(arr,target,index+1);
        answer.addAll(belowCallAnswers);
        return answer;
    }

    private static List<Integer> findDuplicates(int[] arr, int target, List<Integer> ans, int index) {
        if(index==arr.length){
            return ans;
        }
        if(arr[index]==target){
            ans.add(index);
        }
        return findDuplicates(arr,target,ans,index+1);
    }
}
