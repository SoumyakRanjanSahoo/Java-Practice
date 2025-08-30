package Strings_Programm;

public class SmallestSubstringPallindrom {
    public static void main(String[] args) {
        String s ="malayalam";
        String SmallSubPallindrome="";
        for(int i=0;i<s.length();i++){
            for(int j=i+3;j<=s.length();j++){
                String str=s.substring(i,j);

                if(isPallindrome(str)) {
                    if(str.length() < SmallSubPallindrome.length() || SmallSubPallindrome.isEmpty()){
                        SmallSubPallindrome=str;
                    }
                }
            }
        }
        System.out.println(SmallSubPallindrome);
    }
    public  static boolean isPallindrome(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
