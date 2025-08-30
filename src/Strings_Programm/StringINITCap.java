package Strings_Programm;

public class StringINITCap {
    public static void main(String[] args) {
        System.out.println(Init("java is easy"));
    }

    static String Init(String s){
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(i==0 || ch[i-1]==' '){
                if(ch[i]>='a' && ch[i]<='z'){
                    ch[i]-=32;
                }
            }

        }
        return new String(ch);
    }
}
