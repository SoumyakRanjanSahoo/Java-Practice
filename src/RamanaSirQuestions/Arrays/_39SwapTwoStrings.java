package RamanaSirQuestions.Arrays;

public class _39SwapTwoStrings {
    public static void main(String[] args) {
        String s1="Soumyak";
        String s2="Ronee";
        System.out.println(s1+"  "+ s2);
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s1+"  "+ s2);

    }
}
