package Strings_Programm;

public class SecondMinOccurCharcter {
    public static void main(String[] args) {
        String s = "java is very easy";
        char[] ch = s.toCharArray();
        char minChar = '\u0000', secondMinChar = '\u0000';
        int minCount = Integer.MAX_VALUE, secondMinCount = Integer.MAX_VALUE;

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

            // Update min and second min occurring characters
            if (count < minCount) {
                secondMinCount = minCount;
                secondMinChar = minChar;

                minCount = count;
                minChar = ch[i];
            } else if (count < secondMinCount && count > minCount) {
                secondMinCount = count;
                secondMinChar = ch[i];
            }
        }

        System.out.println("Min occurring character: " + minChar + " = " + minCount);
        System.out.println("Second min occurring character: " + secondMinChar + " = " + secondMinCount);
    }
}
