package src.leetcode;

import java.util.HashMap;
import java.util.Map;

class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(isValid("({}[]"));
    }
    public static boolean isValid(String s) {
        Map<Character, Integer> countMap=getCount(s);
        int count1=countMap.getOrDefault('(',0);
        int count2=countMap.getOrDefault(')',0);
        int count3=countMap.getOrDefault('{',0);
        int count4=countMap.getOrDefault('}',0);
        int count5=countMap.getOrDefault('[',0);
        int count6=countMap.getOrDefault(']',0);
        if((count1+count2)%2==0){
            if((count3+count4)%2==0){
                if((count5+count6)%2==0){
                    return true;
                }
            }
        }
        return false;

    }
    public static Map<Character, Integer>getCount(String s){
        Map<Character, Integer>count=new HashMap();
        int exCount=0;
         int newCount=0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case '(':
                     exCount=count.getOrDefault('(',0);
                     newCount=exCount==0?1:exCount+1;
                    count.put('(',newCount);
                    break;
                case ')':
                     exCount=count.getOrDefault(')',0);
                     newCount=exCount==0?1:exCount+1;
                    count.put(')',newCount);
                    break;
                case '{':
                     exCount=count.getOrDefault('{',0);
                     newCount=exCount==0?1:exCount+1;
                    count.put('{',newCount);
                    break;
                case '}':
                    exCount=count.getOrDefault('}',0);
                    newCount=exCount==0?1:exCount+1;
                    count.put('}',newCount);
                    break;
                case '[':
                     exCount=count.getOrDefault('[',0);
                     newCount=exCount==0?1:exCount+1;
                    count.put('[',newCount);
                    break;
                case ']':
                     exCount=count.getOrDefault(']',0);
                     newCount=exCount==0?1:exCount+1;
                    count.put(']',newCount);
                    break;

            }

        }
        return count;
    }
}
