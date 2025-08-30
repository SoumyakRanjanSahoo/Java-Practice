package RamanaSirQuestions.Arrays;

public class _14he121w2r3d {
    public static void main(String[] args) {
        String s="helloworld";
        char[]ch=s.toCharArray();
        for (int i=0;i<ch.length;i++){
            char count='1';
            if (ch[i]=='\u0000')continue;
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    count++;
                    ch[j]=count;
                }
            }
            if (count!='1'){
                ch[i]='1';
            }
        }
        System.out.println(new String(ch));
    }
}
