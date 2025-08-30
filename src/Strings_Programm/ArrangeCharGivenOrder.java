package Strings_Programm;

public class ArrangeCharGivenOrder {
    public static void main(String[] args) {
        String s="JavaDev@12#@*";
        String lc="";
        String uc="";
        String nc="";
        String sp="";

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch >='A' && ch<='Z')uc+=ch;
            else if(ch >='a' && ch<='z')lc+=ch;
            else if(ch >='0' && ch<='9')nc+=ch;
            else sp+=ch;
        }
        System.out.println(lc+uc+nc+sp);
    }
}
