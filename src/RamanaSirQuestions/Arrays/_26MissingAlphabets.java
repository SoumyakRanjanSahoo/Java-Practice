package RamanaSirQuestions.Arrays;

public class _26MissingAlphabets {
    public static void main(String[] args) {
        String s="abc";
        for (char i='a';i<='z';i++){
            if (!s.contains(i+"")) System.out.println(i);
        }
    }
}
