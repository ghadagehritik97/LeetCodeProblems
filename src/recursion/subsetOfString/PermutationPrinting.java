package src.recursion.subsetOfString;

import java.util.ArrayList;

public class PermutationPrinting {
    public static void main(String[] args) {
        String abc="abc";
//        printPermutations("",abc);

        System.out.println(returnPermutations("","hritik"));
    }

    private static void printPermutations(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i);
            printPermutations(f+ch+l,up.substring(1));
        }
    }

    private static ArrayList<String> returnPermutations(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String>per=new ArrayList<>();
            per.add(p);
            return per;
        }
        ArrayList<String>ans=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i);
            ans.addAll(returnPermutations(f+ch+l,up.substring(1)));
        }
        return ans;
    }
}
