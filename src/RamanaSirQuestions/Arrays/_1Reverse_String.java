package RamanaSirQuestions.Arrays;

public class _1Reverse_String {
    public static void main(String[] args) {
       String s="Soumyak";
       StringBuilder res= new StringBuilder();
       for (int i=s.length()-1;i>=0;i--){
           res.append(s.charAt(i));
       }
        System.out.println(res);
    }
}
