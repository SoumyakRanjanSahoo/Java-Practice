package Class_Test;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String s="abbcceffg";
        NonRepeat(s);
    }

    private static void NonRepeat(String s) {
        char[]ch=s.toCharArray();
        String res="";
        for (int i=0;i< ch.length;i++){
            int count=0;
            for (int j=0;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    count++;
                }
            }
            if (count==1) System.out.println(ch[i]);
            break;
        }

    }
}
