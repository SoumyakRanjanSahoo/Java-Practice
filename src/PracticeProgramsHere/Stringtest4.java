package PracticeProgramsHere;

public class Stringtest4 {

//    p-10
//    public static void main(String[] args) {
//        String s="jaavaavavavva";
//        String res="";
//        char [] ch=s.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            if(ch[i]=='\u0000')
//                continue;
//            for (int j=i+1;j<ch.length;j++){
//                if(ch[i]==ch[j]){
//                    ch[j]='\u0000';
//                }
//            }
//            res+=ch[i];
//        }
//        System.out.println(res);
//    }


//    p-11

//
//public static void main(String[] args) {
//    String s="java";
//    String res="";
//    char [] ch=s.toCharArray();
//    for(int i=0;i<ch.length;i++){
//        if(ch[i]=='\u0000')
//            continue;
//        boolean isUnique=true;
//        for (int j=0;j<ch.length;j++){
//            if(i!=j && ch[i]==ch[j]){
//               isUnique=false;
//               break;
//            }
//        }
//        if(isUnique){
//            res+=ch[i];
//        }
//
//    }
//    System.out.println(res);
//}

//    p-12
//    public static void main(String[] args) {
//        String s="BOSS";
//
//        char [] ch=s.toCharArray();
//        for(int i=0;i<ch.length-1;i++){
//            if(ch[i]==ch[i+1])
//                ch[i+1]='$';
//        }
//        System.out.println(ch);
//    }
//
//    p-13

//not solved
//    public static void main(String[] args) {
//        String s="java       is   eassy";
//        String res="";
//
//        char [] ch=s.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            if(ch[i]==' ')
//                ch[i+1]='$';
//        }
//        System.out.println(ch);
//    }

//p-14
//    public static void main(String[] args) {
//
//        String s="soumyak ranjan sahoo";
//        char[] ch=s.toCharArray();
//
//        for(int i=0;i<ch.length;i++){
//                if(i==0 || ch[i-1]==' '){
//                    if(ch[i]>='a' && ch[i]<='z'){
//                        ch[i]-=32;
//                    }
//                }
//        }
//        System.out.println(ch);
//    }

//    p-15


//    public static void main(String[] args) {
//        String s="java is very easy";
//        char[] ch=s.toCharArray();
//
//        for(int i=0;i<ch.length;i++){
//            int count=1;
//            if(ch[i]=='\u0000')
//                continue;
//            for (int j=i+1;j<ch.length;j++){
//                if(ch[i]==ch[j]){
//                    count++;
//                    ch[j]='\u0000';
//                }
//            }
//            System.out.println(ch[i]+"="+count);
//        }
//
//    }


}
