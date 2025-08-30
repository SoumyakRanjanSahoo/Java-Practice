package RamanaSirQuestions.Arrays;

public class _38SmallestSubstringpal {
    public static void main(String[] args) {
        String s="Malayalam";
        String small="";
        int min=Integer.MAX_VALUE;
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                String str=s.substring(i,j);
                if (isPal(str)) {
                    if (str.length()<min){
                        min=str.length();
                        small=str;
                    }
                }
            }
        }
        System.out.println(small+"="+min);
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
