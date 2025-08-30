package Strings_Programm;

public class ClassTocla$$ {
        public static void main(String[] args) {
            String input = "class";
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                    output.append("$$");
                    i++;
                } else {
                    output.append(input.charAt(i));
                }
            }
            System.out.println(output);  // prints: cl$$s
        }
    }

