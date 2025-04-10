package src.recursion.subsetOfString;

public class RemoveCharFromString {
    public static void main(String[] args) {
        String name="Hritik";
        String ans="";
        skipChar(ans,name);
    }

    private static void skipChar(String ans, String name) {
        if(name.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=name.charAt(0);
        if(ch=='i'){
            skipChar(ans, name.substring(1));
        }
        else{

            skipChar(ans + ch, name.substring(1));

        }
    }
}
