package Strings_Programm;

public class PossibleSubstrings {
    public static void main(String[] args) {
        String s ="malayalam";
        for(int i=0;i<s.length();i++){
            for(int j=i+3;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
