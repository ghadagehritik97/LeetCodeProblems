package src.recursion.subsetOfString;

import java.util.ArrayList;

public class PhoneKeypad {
    public static void main(String[] args) {
        String number="13";
        ArrayKeypadCombo("",number);
    }

    private static void keypadCombo(String s, String number) {
        if(number.isEmpty()){
            System.out.println(s);
            return;
        }
        int digit=number.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            keypadCombo(s+ch,number.substring(1));
        }
    }
    private static ArrayList<String> ArrayKeypadCombo(String s, String number) {
        if(number.isEmpty()){
            ArrayList<String>ans=new ArrayList<>();
            ans.add(s);
            return ans;
        }
        ArrayList<String>ans=new ArrayList<>();
        int digit=number.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(ArrayKeypadCombo(s+ch,number.substring(1)));
        }
        return ans;
    }
}
