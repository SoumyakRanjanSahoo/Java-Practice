package RamanaSirQuestions.Arrays;

public class _50ReplaceVowels {
    public static void main(String[] args) {
        String s="abeijho";
        int count=0;
        String res="";
        for (int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) count++;
        }
        if (count>3){
            for (int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if (isVowel(ch)){
                    res+="-";
                }else res+=ch;
            }
        }
        System.out.println(res);
    }
    static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i'||  c=='o' || c=='u';
    }
}
