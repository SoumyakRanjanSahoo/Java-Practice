package RamanaSirQuestions.Arrays;

public class _21SentenceReverse {
    public static void main(String[] args) {
        String s="easy very is java";
        int i=s.length()-1;
        int j=s.length()-1;
        String res="";
        while (i>0){
            while (i>=0 && s.charAt(i)!=' ')i--;
            int k=i+1;
            while (k<=j){
                res+=s.charAt(k);
                k++;
            }
            if (i>0)res+=" ";
            i--;
            j=i;
        }
        System.out.println(res);
    }
}
