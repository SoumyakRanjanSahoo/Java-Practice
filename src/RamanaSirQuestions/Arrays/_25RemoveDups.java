package RamanaSirQuestions.Arrays;

public class _25RemoveDups {
    public static void main(String[] args) {
        String s="ramana";
        String res="";
        char[]ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (res.indexOf(c)==-1)res+=c;
        }
        System.out.println(res);
    }
}

//public class _25RemoveDups {
//    public static void main(String[] args) {
//        String s="ramana";
//        String res="";
//        char[]ch=s.toCharArray();
//        for (int i=0;i<s.length();i++){
//            char c=s.charAt(i);
//            int count=0;
//           for (int j=0;j<s.length();j++){
//               if (s.charAt(j)==c)count++;
//           }
//           if (count==1)res+=c;
//        }
//        System.out.println(res);
//    }
//}
