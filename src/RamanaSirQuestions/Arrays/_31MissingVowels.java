package RamanaSirQuestions.Arrays;

public class _31MissingVowels {
    public static void main(String[] args) {
        String s="abc";
        String vowels="aeiou";
        for (char v:vowels.toCharArray()){
            if (s.indexOf(v)==-1) System.out.println(v+" ");
        }

    }
}
