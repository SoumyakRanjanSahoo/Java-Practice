package RamanaSirQuestions.Arrays;

public class _41AsciiSum {
    public static void main(String[] args) {
        String s="abc";
        int sum=0;
        for (int i=0;i<s.length();i++){
            sum+=s.charAt(i);
        }
        System.out.println(sum);
    }
}
