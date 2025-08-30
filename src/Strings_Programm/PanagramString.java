package Strings_Programm;

public class PanagramString {

    public static void main(String[] args) {
        System.out.println(ispanagram("a quick brown fox jumps over the lazy dog"));
    }

    public static boolean ispanagram(String s){
        if(s.length()<26)
            return false;

        s=s.toLowerCase();
        for(char ch='a';ch<='z';ch++){
            if(!s.contains(ch+""))
                return false;

        }
        return true;
    }

       

}
