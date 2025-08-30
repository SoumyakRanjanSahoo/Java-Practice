package PracticeProgramsHere;

public class Strringtest3 {
//    p-7
//    public static void main(String[] args) {
//
//        String s="Java Is very easy";
//        String res="";
//
//       int i=0;
//       int j=0;
//       while (j<s.length()){
//           while (j<s.length() && s.charAt(j)!=' ')j++;
//           int k=j-1;
//           while (k>=i) {
//               res += s.charAt(k);
//               k--;
//           }
//           if(j<s.length())
//               res+=' ';
//           j++;
//           i=j;
//       }
//        System.out.println(res);
//    }

    //    p-8
//    public static void main(String[] args) {
//        String s = "java is easy";
//        String res = "";
//
//        int i = s.length() - 1;
//        int j = s.length() - 1;
//        while (i >= 0) {
//            while (i >= 0 && s.charAt(i) != ' ') i--;
//            int k = i + 1;
//            while (k <= j) {
//                res += s.charAt(k);
//                k++;
//            }
//            if (i > 0) {
//                res += ' ';
//                i--;
//                j=i;
//            }
//
//        }
//        System.out.println(res);
//    }


//    p-9
//
//    public static void main(String[] args) {
//        String s="JavaDev";
//        char[] ch=s.toCharArray();
//       for (int i=0;i<ch.length;i++){
//           if(ch[i]>='A'&& ch[i]<='Z'){
//               ch[i]=(char)(ch[i]+32);}
//           else if(ch[i]>='a'&& ch[i]<='z'){
//                   ch[i]=(char)(ch[i]-32);
//               }
//           }
//        System.out.println(ch);
//       }
//public static void main(String[] args) {
//    String s="Ra12mana23";
//    s=s.replaceAll("[0-9]","");
//    System.out.println(s);
//}


//    public static void main(String[] args) {
//        String s="java is easy";
//        String res="";
//        int i=0;
//        int j=0;
//        while (j<s.length()){
//            while (j<s.length() && s.charAt(j)!=' ')j++;
//
//                int k=j-1;
//                while (k>=i){
//                    res+=s.charAt(k);
//                    k--;
//                }
//                if(j<s.length()){
//                    res+=" ";
//                    j++;
//                    i=j;
//                }
//            }
//
//
//        System.out.println(res);
//    }


//    public static void main(String[] args) {
//        String s="BOSS";
//        String res="";
//        char [] ch=s.toCharArray();
//        for(int i=0;i<ch.length-1;i++){
//            if(ch[i]==ch[i+1]){
//                ch[i+1]='$';
//            }
//            res=new String(ch);
//        }
//        System.out.println(res);
//    }

    public static void main(String[] args) {
        String s="java is easy";
        String res="";
        int i=0;
        int j=0;

while (j<s.length()) {
    while (j < s.length() && s.charAt(j) != ' ') j++;
    int k = j - 1;
    while (k >= i) {
        res += s.charAt(k);
        k--;
    }
    if (j < s.length()) {
        res += " ";
    }
    j++;
    i=j;
}
        System.out.println(res);
    }
}