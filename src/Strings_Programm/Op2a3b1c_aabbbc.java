package Strings_Programm;

public class Op2a3b1c_aabbbc {

        public static void main(String[] args) {
            String input = "3a4b1c";
            System.out.println(decodeString(input));
        }

        public static String decodeString(String s) {
            StringBuilder result = new StringBuilder();
            int n = s.length();

            for (int i = 0; i < n; i++) {
                if (Character.isDigit(s.charAt(i))) {
                    int count = s.charAt(i) - '0'; // Convert char to integer
                    char ch = s.charAt(i + 1); // Get the next character
                    for (int j = 0; j < count; j++) {
                        result.append(ch);
                    }
                    i++; // Skip the character after the digit
                }
            }
            return result.toString();
        }
    }

