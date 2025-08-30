package RamanaSirQuestions.Arrays;

public class _4Palindrome {
    public static void main(String[] args) {
        String s="madam";
        System.out.println(isPal(s));
    }

    private static boolean isPal(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if ( s.charAt(i)==s.charAt(j)){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}
