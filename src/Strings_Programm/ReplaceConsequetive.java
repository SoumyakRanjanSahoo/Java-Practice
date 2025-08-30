package Strings_Programm;

public class ReplaceConsequetive {
    public static void main(String[] args) {
        String s = "BOSS";  // Example input
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                ch[i + 1] = '$';
            }
        }

        String res = new String(ch);
        System.out.println(res);
    }
}
