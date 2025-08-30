package RamanaSirQuestions.Arrays;

public class _33SplitArrayWithoutSplit {
    public static void main(String[] args) {
        String s="java is easy";
        int count=1;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' ')count++;
        }
        String[]words=new String[count];
        int index=0;
        String temp = "";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch!=' ')temp+=ch;
            else{
                words[index++]=temp;
                temp="";
            }
        }

        words[index]=temp;

        for (String w:words){
            System.out.println(w);
        }
    }
}
