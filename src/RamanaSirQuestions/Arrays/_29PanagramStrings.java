package RamanaSirQuestions.Arrays;

public class _29PanagramStrings {
    public static void main(String[] args) {
        String s="abcdefghijklmnopqrstuvwxyz";
        System.out.println(isPanagram(s));
    }

    private static boolean isPanagram(String s) {
        if (s.length()<26)return false;
        for (char i='a';i<='z';i++){
            if (!s.contains(i+""))return false;
        }
        return true;
    }
}
