package RamanaSirQuestions.Arrays;

public class _48MissingAlphabets {
    public static void main(String[] args) {
        String s="abgwisjsbxnwdd";
        for (char ch='a';ch<='z';ch++){
            if (s.indexOf(ch)==-1){
                System.out.print(ch + " ");
            }
        }
    }
}
