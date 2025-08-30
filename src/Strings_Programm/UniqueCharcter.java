package Strings_Programm;


public class UniqueCharcter {
    public static void main(String[] args) {
        String s = "jaava";
        char[] ch = s.toCharArray();
        String res = "";

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '\u0000')
                continue;

            boolean isUnique = true;

            for (int j = 0; j < ch.length; j++) {
                if (i != j && ch[i] == ch[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                res += ch[i];
            }
        }

        System.out.println(res);
    }
}