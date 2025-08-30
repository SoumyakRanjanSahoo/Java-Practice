package RamanaSirQuestions.Arrays;

public class _32OccuranceWithoutReplace {
    public static void main(String[] args) {
        String s="jaavvv";
        char[]ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
            if(ch[i]=='\u0000')continue;
            int count=1;
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    count++;
                    ch[j]='\u0000';
                }
            }
            System.out.println(ch[i]+"="+count);
        }
    }
}
