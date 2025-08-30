package RamanaSirQuestions.Arrays;

public class _2Arrange_Charcter {
    public static void main(String[] args) {
        String s="ram#123";
        String Ucase="";
        String Lcase="";
        String Numbers="";
        String Scase="";
        char[]ch=s.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]>'0' && ch[i]<='9')Numbers+=ch[i];
            else if (ch[i]>='a' && ch[i]<='z')Lcase+=ch[i];
            else if (ch[i]>='A' && ch[i]<='z')Ucase+=ch[i];
            else Scase+=ch[i];
        }

        System.out.println(Numbers+Scase+Lcase);
    }
}
