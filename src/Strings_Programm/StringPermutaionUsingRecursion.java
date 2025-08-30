package Strings_Programm;

public class StringPermutaionUsingRecursion {
    public static void main(String[] args) {
        String s="abc";
        ispermutation(s,0,s.length());
    }
    public static void ispermutation(String s,int st,int end ){
        if(st==end){
            System.out.println(s);
            return;
        }
        for(int i=st;i<end;i++){
            String s1=swap(s,st,i);
            ispermutation(s1,st+1,end);
        }
    }


    public static  String swap(String s,int i,int j){
        char[] ch=s.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return new String(ch);
    }
}
