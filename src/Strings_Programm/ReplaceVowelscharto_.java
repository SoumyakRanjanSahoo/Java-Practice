package Strings_Programm;

public class ReplaceVowelscharto_ {

        public static void main(String[] args) {
            String s = "kukka pilla"; // Example input
            System.out.println(replaceVowels(s));
        }

        public static String replaceVowels(String s) {
            char[] ch = s.toCharArray();
            int vowelCount = 0;

            // Counting vowels
            for (int i = 0; i < ch.length; i++) {
                if (isVowel(ch[i])) {
                    vowelCount++;
                }
            }

            // Replacing vowels if count > 3
            if (vowelCount > 3) {
                for (int i = 0; i < ch.length; i++) {
                    if (isVowel(ch[i])) {
                        ch[i] = '-';
                    }
                }
            }

            return new String(ch);
        }

        public static boolean isVowel(char c) {
            c = Character.toLowerCase(c);
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
    }

