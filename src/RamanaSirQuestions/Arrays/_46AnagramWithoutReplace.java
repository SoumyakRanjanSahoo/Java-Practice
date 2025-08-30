package RamanaSirQuestions.Arrays;

import java.util.Arrays;

public class _46AnagramWithoutReplace {
    public static void main(String[] args) {
        String s1="race";
        String s2="care";
        if (s1.length()!=s2.length()){
            System.out.println("Not Anagram");
            return;
        }
        char[]arr1=s1.toCharArray();
        char[]arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}
