package RamanaSirQuestions.Arrays;

public class _5StringToCharArray {
    public static void main(String[] args) {
        String s="Soumyak";
        char[]ch=new char[s.length()];
        for (int i=0;i<s.length();i++){
            ch[i]=s.charAt(i);
        }
        System.out.println(ch);
    }
}
