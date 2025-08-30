package Strings_Programm;

public class MinOccurCharcter {
    public static void main(String[] args) {
        String s = "java is very easy";
        char[] ch = s.toCharArray();
        char minChar = '\u0000';
        int minCount = s.length(); // Set to string length as an upper bound

        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if (ch[i] == '\u0000' || ch[i] == ' ')
                continue;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\u0000'; // Mark duplicate characters as processed
                }
            }

            // Update the minimum occurring character
            if (count < minCount) {
                minCount = count;
                minChar = ch[i];
            }
        }

        System.out.println("Min occurring character: " + minChar + " = " + minCount);
    }
}

