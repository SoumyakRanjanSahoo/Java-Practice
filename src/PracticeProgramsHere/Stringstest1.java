package PracticeProgramsHere;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringstest1 {

        public static void main(String[] args) {
            String input = "boaata";
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


