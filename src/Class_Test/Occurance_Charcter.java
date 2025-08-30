package Class_Test;

public class Occurance_Charcter {
    public static void main(String[] args) {
        String s="jaavvv";
        System.out.println(Occurance(s));
    }

    private static String Occurance(String s) {
        char[]ch=s.toCharArray();
        String res="";
        for (int i =0;i<ch.length;i++){
            int count=1;
            if (ch[i]=='\u0000')continue;
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j]){
                    count++;
                    ch[j]='\u0000';
                }
            }
            res+=ch[i]+"="+count+"\n";
        }
     return res;
    }

}
