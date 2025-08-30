package Strings_Programm;

public class SecondMaxOccurChar {
    public static void main(String[] args) {
        String s = "jaavvv";
        char[] ch = s.toCharArray();
        char maxChar = '\u0000', secondMaxChar = '\u0000';
        int maxCount = 0, secondMaxCount = 0;

        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if (ch[i] == '\u0000')
                continue;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '\u0000'; // Mark duplicate characters as processed
                }
            }

            // Update max and second max occurring characters
            if (count > maxCount) {
                secondMaxCount = maxCount;
                secondMaxChar = maxChar;

                maxCount = count;
                maxChar = ch[i];
            } else if (count > secondMaxCount && count < maxCount) {
                secondMaxCount = count;
                secondMaxChar = ch[i];
            }
        }

        System.out.println("Max occurring character: " + maxChar + " = " + maxCount);
        System.out.println("Second max occurring character: " + secondMaxChar + " = " + secondMaxCount);
    }
}
