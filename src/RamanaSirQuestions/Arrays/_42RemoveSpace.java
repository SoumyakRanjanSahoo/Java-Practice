package RamanaSirQuestions.Arrays;

public class _42RemoveSpace {
    public static void main(String[] args) {
        String s="java is easy";
        String res="";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch!=' ')res+=ch;
        }
        System.out.println(res);
    }
}
