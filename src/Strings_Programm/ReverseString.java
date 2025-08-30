package Strings_Programm;

public class ReverseString {
    public static void main(String[] args) {
        String s="java";
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        System.out.println(s);
        System.out.println(res);
    }
}
