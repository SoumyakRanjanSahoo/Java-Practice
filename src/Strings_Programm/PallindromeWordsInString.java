package Strings_Programm;

public class PallindromeWordsInString {


    public static void main(String[] args) {

        String s="madam sir madam antye";
        String[] str=s.split(" ");

        for(int i=0;i<str.length;i++){
            if (str[i].equals(" "))
                continue;

                if(isPallindrome(str[i])){
                    System.out.println(str[i]);
                }
            }
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
