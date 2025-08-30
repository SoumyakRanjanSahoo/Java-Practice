package RamanaSirQuestions.Arrays;

public class _16InitCap {
    public static void main(String[] args) {
        String s="india that is bharat";
       char[]ch=s.toCharArray();
       for (int i=0;i< ch.length;i++){
           if (i==0 || ch[i-1]==' '){
               if (ch[i]>='a'&& ch[i]<='z')ch[i]-=32;
           }
       }
        System.out.println(new String(ch));
    }
}
