package Strings_Programm;
//input="Java is easy "
//output="avaj si ysae"

public class ReverseWords {
    public static void main(String[] args) {
        String s="Java is Very Easy";
        System.out.println(rev(s));
    }
    public static String rev(String s){
        int i=0;
        int j=0;
        String res="";
        while(j<s.length()){
            while(j<s.length() && s.charAt(j)!=' ')j++;
            int k=j-1;
            while(k>=i){
                res+=s.charAt(k);
                k--;
            }
            if(j<s.length()){
                res+=" ";
            }
            j++;
            i=j;
        }
        return res;
    }
}
