package RamanaSirQuestions.Arrays;

public class _36PalindromeSustring {
    public static void main(String[] args) {
        String s="Malayalam";
        for (int i=0;i<s.length();i++){
            for (int j=i+3;j<s.length();j++){
                String str=s.substring(i,j);
                if (isPal(str)) System.out.println(str);
            }
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
