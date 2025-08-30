package Class_Test;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "care";
        String s2 = "race";
        System.out.println(isAnagram(s1, s2));
    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        char ch = s1.charAt(0);
        s1 = s1.replace(ch + "", "");
        s2 = s2.replace(ch + "", "");
        if (s1.length() == 0 && s2.length() == 0)
            return true;

        return isAnagram(s1, s2);
    }

}
