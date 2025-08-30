package RamanaSirQuestions.Arrays;

public class _24SubString {
    public static void main(String[] args) {
        String s="Malayalam";
        for (int i=0;i<s.length();i++){
            for (int j=i+3;j<s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
