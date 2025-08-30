package RamanaSirQuestions.Arrays;

public class _45RemoveExtraSpace {
    public static void main(String[] args) {
        String s = "java         is         easy";
        char[] ch = s.toCharArray();
        String res = "";
        boolean spaceFound = false;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                if (!spaceFound) {
                    res += ch[i];
                    spaceFound = true;
                }
            } else {
                res += ch[i];
                spaceFound = false;
            }
        }

        System.out.println(res);
    }
}
