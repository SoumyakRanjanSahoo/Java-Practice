package RamanaSirQuestions.Arrays;

public class _9ChangeCharcter {
    public static void main(String[] args) {
        String s="Ramana";

        StringBuilder res= new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='a')res.append('@');
            else res.append(s.charAt(i));

        }
        System.out.println(res);
    }
}
