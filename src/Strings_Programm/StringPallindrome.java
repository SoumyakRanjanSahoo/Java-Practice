package Strings_Programm;

public class StringPallindrome {
    public static void main(String[] args) {
        String s="malayalam";
        System.out.println(s+ ispallindrome(s)+"is a pallindrome number");
        System.out.println(s+ ispallindrome(s)+"is not  pallindrome number");
    }

    public static boolean ispallindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;

            i++;
            j--;
        }
        return true;
    }
}
