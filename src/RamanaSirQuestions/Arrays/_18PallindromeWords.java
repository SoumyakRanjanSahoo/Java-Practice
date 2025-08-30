package RamanaSirQuestions.Arrays;

public class _18PallindromeWords {
    public static void main(String[] args) {
        String s="eye level car boy";
        String[]str=s.split(" ");
        for (String word:str){
            if (isPal(word)) System.out.println(word);
        }
    }
    static boolean isPal(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
