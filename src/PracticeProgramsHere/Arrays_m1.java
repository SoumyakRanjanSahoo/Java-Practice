package PracticeProgramsHere;


class Arrays_m1{
    public static void main(String[] args) {

        String s="javaaaa";
        System.out.println(rev(s));
    }
    public static String rev(String s){
       String res="";
       char[]ch=s.toCharArray();
       for (int i=0;i<ch.length;i++){
           if (ch[i]=='\u0000')continue;
           boolean isunique=true;
           for (int j=0;j<ch.length;j++){
               if (i!=j && ch[i]==ch[j]){
                   isunique=false;
                   break;
               }
           }
           if (isunique) res+=ch[i];
       }
       return res;
    }
}