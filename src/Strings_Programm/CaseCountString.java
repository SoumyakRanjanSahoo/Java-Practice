package Strings_Programm;

public class CaseCountString {
    public static void main(String[] args) {
        String s="JavaDev@12#@*";
        int lc=0;
        int uc=0;
        int nc=0;
        int sp=0;

        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch >='A' && ch<='Z')uc++;
           else if(ch >='a' && ch<='z')lc++;
           else if(ch >='0' && ch<='9')nc++;
            else sp++;
        }
        System.out.println(lc);
        System.out.println(uc);
        System.out.println(nc);
        System.out.println(sp);
    }
}
