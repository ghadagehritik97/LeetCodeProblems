package src.recursion.subsetOfString;

import java.util.ArrayList;

public class SubsequenceOfString {
    public static void main(String[] args) {
        String up="abc";
//        subsequenceOfString("",up);
        System.out.println(returningSubsequenceAns("",up));
    }

    private static void subsequenceOfString(String s, String up) {
        if(up.isEmpty()){
            System.out.println(s);
            return;
        }
        char ch=up.charAt(0);
        subsequenceOfString(s+ch,up.substring(1));
        subsequenceOfString(s,up.substring(1));

    }

    private static ArrayList<String>returningSubsequenceAns(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=returningSubsequenceAns(p+ch,up.substring(1));
        ArrayList<String>right=returningSubsequenceAns(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
