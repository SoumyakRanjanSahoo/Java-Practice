package Strings_Programm;

public class MaxOccurCharcter {

        public static void main(String[] args) {
            String s = "java is very easy";
            char[] ch = s.toCharArray();
            char maxChar = '\u0000';
            int maxCount = 0;

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

                // Update the max occurring character
                if (count > maxCount) {
                    maxCount = count;
                    maxChar = ch[i];
                }
            }

            System.out.println("Max occurring character: " + maxChar + " = " + maxCount);
        }
    }


